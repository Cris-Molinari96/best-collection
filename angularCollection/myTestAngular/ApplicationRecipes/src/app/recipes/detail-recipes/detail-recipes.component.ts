import {Component, OnInit} from '@angular/core';
import {Recipe} from "../../models/recipe.model";
import {ActivatedRoute, Params, Router} from "@angular/router";
import {RecipesServiceService} from "../../services/recipes-service.service";

@Component({
  selector: 'app-detail-recipes',
  templateUrl: './detail-recipes.component.html',
  styleUrls: ['./detail-recipes.component.css']
})
export class DetailRecipesComponent implements OnInit {

  recipe!: Recipe | undefined;

  // @Input() recipeSelected!:Recipe;

  constructor(private aRoute: ActivatedRoute, private recipeService: RecipesServiceService,private route:Router) {
  }

  ngOnInit() {
    const param: Params = this.aRoute.snapshot.params;
    const id: number = +param['id']
    this.recipe = this.recipeService.getRecipe(id);

    this.aRoute.params.subscribe(
      (param) => {
        this.recipe = this.recipeService.getRecipe(parseInt(param['id']))
      }
    )
  }

  onUpdate() {
    this.route.navigate(['edit'], {relativeTo:this.aRoute})
  }

  onDelete() {

  }
}
