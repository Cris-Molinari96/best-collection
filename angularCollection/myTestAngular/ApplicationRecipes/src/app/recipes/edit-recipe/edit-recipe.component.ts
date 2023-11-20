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
    let arrayIngredient = new FormArray([])

     /* // ! Aggiungere nel form array gli ingredienti

    if(itemRecipe?.ingredients.length != 0){
      for (let ingredient of itemRecipe?.ingredients!){
        arrayIngredient.push(
          new FormGroup({
          'name':new FormControl(ingredient.name),
          'amount':new FormControl(ingredient.amount)
        }))
      }
    }*/

    console.log(itemRecipe?.description);
    this.initFormTemplate = new FormGroup<any>({
      'name':new FormControl(itemRecipe?.name),
      'imagePath':new FormControl(itemRecipe?.imageUrl),
      'description':new FormControl(itemRecipe?.description)
    })
  }

  public onSubmit(){
    console.log(this.recipe?.id);
  }
}
