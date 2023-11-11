import {Component, OnInit} from '@angular/core';
import {RecipesServiceService} from "../../services/recipes-service.service";
import {Recipe} from "../../models/recipe.model";
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-edit-recipe',
  templateUrl: './edit-recipe.component.html',
  styleUrls: ['./edit-recipe.component.css']
})
export class EditRecipeComponent implements OnInit{

  recipe!:Recipe|undefined;

  constructor(private recipeService:RecipesServiceService, private aRoute:ActivatedRoute) {
  }

  ngOnInit() {
    const param: Params = this.aRoute.snapshot.params;
    const id: number = +param['id'];

    this.recipe = this.recipeService.getRecipe(id);
  }
}
