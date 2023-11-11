import { Component, Input } from '@angular/core';
import {Recipe} from '../../../models/recipe.model'
import {RecipesServiceService} from "../../../services/recipes-service.service";
import {ActivatedRoute, Router} from "@angular/router";
@Component({
  selector: 'app-recipe-item',
  templateUrl: './recipe-item.component.html',
  styleUrls: ['./recipe-item.component.css']
})
export class RecipeItemComponent{
  @Input() recipe!: Recipe;

  // Devo poter far ascoltare l'evento dall'esterno, quindi al padre, motivo per cui utilizzo @Output
  // @Output() featuredSelect = new EventEmitter<void>();

constructor(private recipeService:RecipesServiceService, private router:Router, private aRoute:ActivatedRoute) {
}

  // * Questo è il modo per emettere un dato, utilizzando il metodo emit()
  // * successivamente stiamo utilizzando una variabile di tipo emit nel service
  // ? Successivamente questo metodo ci renderizza al dettaglio di quella ricetta selezionata
  infoArticolo() {
    // this.recipeService.recipeEmit.emit(this.recipe);
    this.router.navigate([this.recipe.id], {relativeTo:this.aRoute})
  }
}
