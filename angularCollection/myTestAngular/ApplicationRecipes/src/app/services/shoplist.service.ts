import {EventEmitter, Injectable} from '@angular/core';
import {Ingredient} from "../models/ingredient.model";
import {Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ShoplistService {

  newIngredient = new EventEmitter<Ingredient[]>()
  startedEditing = new Subject<number>();


  private ingredientsList:Ingredient[] = [
    new Ingredient("Red Eggs",4),
  ];

  constructor() { }

  // * Dato che non riceviamo più l'array originale se provassimo senza l'aggiunta di ingredientList(variabile usata per emettere un evento)
  // * non visualizziamo più l'array originale ma la copia che viene passata una sola volta.
  getList(){
    return this.ingredientsList.slice();
  }

  getIngredient(index:number){
    return this.ingredientsList[index];
  }

  onAddItem(ingredient:Ingredient){
    this.ingredientsList.push(ingredient);
    // ! Qui stiamo emettendo il nuovo array con l'aggiunta degli ingredienti, shopList si registrerà a quest'evento
    // ! per aggiornare la lista
    this.newIngredient.emit(this.ingredientsList.slice());
  }

  onDeleteItem(){

  }
}
