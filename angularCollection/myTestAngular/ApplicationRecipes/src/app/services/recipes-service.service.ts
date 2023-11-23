import {EventEmitter, Injectable, Output} from '@angular/core';
import {Recipe} from "../models/recipe.model";
import {Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class RecipesServiceService {

  receiptsChange = new Subject<Recipe[]>();
  idRe: number;
  private listRecipes: Recipe[] = [
    new Recipe(
      1,
      "Carbonara",
      "Spaghetti con pecorino," +
      " tuorolo d'uovo, pepe", "assets/image/carbonara.png",
      [{name: 'Eggs', amount: 4}, {name: 'Pecorino', amount: 2}]),
    new Recipe(2, "Matriciana", "spaghetti, guanciale di Amatrice, pomodori pelati e Pecorino", "assets/image/matriciana.png", [])
  ];
  @Output() recipeEmit: EventEmitter<Recipe> = new EventEmitter<Recipe>();

  constructor() {
      this.idRe = this.listRecipes.length;
  }

  addRecipe(recipe: Recipe) {
    this.listRecipes.push(recipe);
  }

  getRecipes(): Recipe[] {
    return this.listRecipes.slice();
  }

  getRecipe(id: number) {
    const item = this.listRecipes.find(
      (item) => {
        return item.id === id
      }
    )
    return item;
  }

  addReceipt(receipt: Recipe) {

    this.idRe++;

    console.log(this.idRe);
    receipt.id = this.idRe;
    this.listRecipes.push(receipt);
    this.receiptsChange.next(this.listRecipes.slice());

  }

  editReceipt(num: number, newReceipt: Recipe) {
    newReceipt.id = num + 1;
    this.listRecipes[num] = newReceipt;
    console.log(newReceipt.id);
    this.receiptsChange.next(this.listRecipes.slice());
  }

}
