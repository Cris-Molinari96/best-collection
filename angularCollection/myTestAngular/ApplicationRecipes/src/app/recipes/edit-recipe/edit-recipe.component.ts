import {Component, OnInit} from '@angular/core';
import {RecipesServiceService} from "../../services/recipes-service.service";
import {Recipe} from "../../models/recipe.model";
import {ActivatedRoute, Params} from "@angular/router";
import {FormArray, FormControl, FormGroup} from "@angular/forms";
import {Ingredient} from "../../models/ingredient.model";

@Component({
  selector: 'app-edit-recipe',
  templateUrl: './edit-recipe.component.html',
  styleUrls: ['./edit-recipe.component.css']
})
export class EditRecipeComponent implements OnInit{

  recipe!:Recipe|undefined;
  initFormTemplate!:FormGroup;
  arrayIngredient = new FormArray<FormGroup>([]);


  constructor(private recipeService:RecipesServiceService, private aRoute:ActivatedRoute) {
  }

  ngOnInit() {
    const param: Params = this.aRoute.snapshot.params;
    const id: number = +param['id'];
    this.recipe = this.recipeService.getRecipe(id);
    this.initForm();
  }

  // diamo la responsabilità a un evento di inizializzare il nostro form
  private initForm(){
    const itemRecipe:Recipe | undefined = this.recipe;

      // ! Aggiungere nel form array gli ingredienti, e settaggio del nostro formArray

    if(itemRecipe?.ingredients.length != 0){
      for (let ingredient of itemRecipe?.ingredients!){
       this.arrayIngredient.push(
          new FormGroup({
          'name':new FormControl(ingredient.name),
          'amount':new FormControl(ingredient.amount)
        }))
      }
    }
//! QUI STIAMO CREANDO IL NOSTRO FORM!
    this.initFormTemplate = new FormGroup<any>({
      'name':new FormControl(itemRecipe?.name),
      'imagePath':new FormControl(itemRecipe?.imageUrl),
      'description':new FormControl(itemRecipe?.description),
      'ingredients': this.arrayIngredient
    })
  }

  get ingredientFormArray():FormArray{
    return this.arrayIngredient;
  }

  public onSubmit(){
    console.log(this.initFormTemplate.value.name);
    console.log(this.initFormTemplate.value.imagePath);
    console.log(this.initFormTemplate.value.description);
    console.log(this.initFormTemplate.value.ingredients);

  }

  setIngredientArrayForm() {

  }
}
