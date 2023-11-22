import {Component, OnInit} from '@angular/core';
import {RecipesServiceService} from "../../services/recipes-service.service";
import {Recipe} from "../../models/recipe.model";
import {ActivatedRoute, Params} from "@angular/router";
import {FormArray, FormControl, FormGroup, Validators} from "@angular/forms";
import {Ingredient} from "../../models/ingredient.model";

@Component({
    selector: 'app-edit-recipe',
    templateUrl: './edit-recipe.component.html',
    styleUrls: ['./edit-recipe.component.css']
})
export class EditRecipeComponent implements OnInit {

    recipe!: Recipe | undefined;
    initFormTemplate!: FormGroup;
    arrayIngredient = new FormArray<FormGroup>([]);
    idReceipts: number | undefined;

    constructor(private recipeService: RecipesServiceService, private aRoute: ActivatedRoute) {
    }

    ngOnInit() {
        this.aRoute.params.subscribe((param: Params) => {
            this.idReceipts = parseInt(param['id']);
            this.recipe = this.recipeService.getRecipe(this.idReceipts);
        })

        // const param: Params = this.aRoute.snapshot.params;
        // this.idReceipts = +param['id'];

        this.initForm();

    }

    // diamo la responsabilità a un evento di inizializzare il nostro form
    private initForm() {
        const itemRecipe: Recipe | undefined = this.recipe;

        // ! Aggiungere nel form array gli ingredienti, e settaggio del nostro formArray

        if (itemRecipe?.ingredients.length != 0) {
            for (let ingredient of itemRecipe?.ingredients!) {
                this.arrayIngredient.push(
                    new FormGroup({
                        'name': new FormControl(ingredient.name, Validators.required),
                        'amount': new FormControl(ingredient.amount, [
                            Validators.required,
                            Validators.pattern(/^[1-9]+[0-9]*$/)
                        ])
                    }))
            }
        }
//! QUI STIAMO CREANDO IL NOSTRO FORM!
        this.initFormTemplate = new FormGroup<any>({
            // 'mainGroup': new FormGroup({
            'name': new FormControl(itemRecipe?.name, Validators.required),
            'imagePath': new FormControl(itemRecipe?.imageUrl, Validators.required),
            'description': new FormControl(itemRecipe?.description, Validators.required),
            // }),
            'ingredients': this.arrayIngredient
        })
    }

    get ingredientFormArray(): FormArray {
        return this.arrayIngredient;
    }

    public onSubmit() {
        const ingredientList = this.initFormTemplate.value.ingredients;

        // console.log(this.initFormTemplate.value['name']);
        // console.log(this.initFormTemplate.value['imagePath']);
        // console.log(this.initFormTemplate.value['description']);
        // console.log(this.initFormTemplate.value['ingredients']);
        let tempId = (this.idReceipts! - 1);

        this.recipeService.editReceipt(tempId, this.initFormTemplate.value);

        for (const ingredientListElement of ingredientList) {
            this.recipe?.onAddIngredientModel(ingredientListElement);
        }

    }

    onAddIngredient() {
        console.log(this.ingredientFormArray.value);
        console.log(this.ingredientFormArray);

        (<FormArray>this.ingredientFormArray).push(
            new FormGroup({
                'name': new FormControl(),
                'amount': new FormControl()
            })
        )
    }
}
