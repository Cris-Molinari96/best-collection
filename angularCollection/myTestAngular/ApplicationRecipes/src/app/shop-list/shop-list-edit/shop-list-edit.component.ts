import {Component, ElementRef, EventEmitter, OnInit, Output, ViewChild} from '@angular/core';
import {Ingredient} from "../../models/ingredient.model";
import {ShoplistService} from "../../services/shoplist.service";

@Component({
  selector: 'app-shop-list-edit',
  templateUrl: './shop-list-edit.component.html',
  styleUrls: ['./shop-list-edit.component.css']
})
export class ShopListEditComponent {
  // recuperiamo i valori da tag html (input)
  @ViewChild('nameIngredient') inputNameIngredient!: ElementRef;
  @ViewChild('amountIngredient') inputAmountIngredient!: ElementRef;

  // questa varaibile d'output viene avvalorata quando si verifica un evento, motivo per cui per
  // accedere alla proprietà dall'esterno abbiamo bisogno delle ()
  // @Output() ingredientAdded = new EventEmitter<Ingredient>();

  constructor(private shopListService: ShoplistService) {
  }


  onAddIngredient() {
    // recuperiamo il loro valore e ci costruiamo un oggetto Ingredient, in quale viene emesso all'esterno
    // e recuperato nel selettore list-edit, dato che si parla di un evento ci leghiamo con le ()
    // const ingredient: Ingredient = new Ingredient(
    //   this.inputNameIngredient.nativeElement.value,
    //   this.inputAmountIngredient.nativeElement.value);
    // this.ingredientAdded.emit(ingredient);
    this.shopListService.onAddItem(new Ingredient(this.inputNameIngredient.nativeElement.value,this.inputAmountIngredient.nativeElement.value))
  }

}
