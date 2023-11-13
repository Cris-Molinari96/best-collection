import {Component, ElementRef, EventEmitter, OnDestroy, OnInit, Output, ViewChild} from '@angular/core';
import {Ingredient} from "../../models/ingredient.model";
import {ShoplistService} from "../../services/shoplist.service";
import {NgForm} from "@angular/forms";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-shop-list-edit',
  templateUrl: './shop-list-edit.component.html',
  styleUrls: ['./shop-list-edit.component.css']
})
export class ShopListEditComponent implements OnInit, OnDestroy {
  // recuperiamo i valori da tag html (input)
  // @ViewChild('nameIngredient') inputNameIngredient!: ElementRef;
  // @ViewChild('amountIngredient') inputAmountIngredient!: ElementRef;

  @ViewChild('form') form: NgForm | undefined;
  item: Ingredient | undefined;
  subscription: Subscription | undefined;


  // questa varaibile d'output viene avvalorata quando si verifica un evento, motivo per cui per
  // accedere alla proprietà dall'esterno abbiamo bisogno delle ()
  // @Output() ingredientAdded = new EventEmitter<Ingredient>();

  constructor(private shopListService: ShoplistService) {
  }

  ngOnInit() {
    this.subscription = this.shopListService.startedEditing.subscribe((eve: number) => {
      const ingredient = this.shopListService.getList()[eve];
      this.item = ingredient;
        console.log(this.item.name)
      this.form?.setValue({
        name:this.item.name,
        amount:this.item.amount
      })
    })
  }

  ngOnDestroy() {
    console.log('distrutto!')
    this.subscription?.unsubscribe();
  }

  // onAddIngredient() {
  // recuperiamo il loro valore e ci costruiamo un oggetto Ingredient, in quale viene emesso all'esterno
  // e recuperato nel selettore list-edit, dato che si parla di un evento ci leghiamo con le ()
  // const ingredient: Ingredient = new Ingredient(
  //   this.inputNameIngredient.nativeElement.value,
  //   this.inputAmountIngredient.nativeElement.value);
  // this.ingredientAdded.emit(ingredient);
  // this.shopListService.onAddItem(new Ingredient(this.inputNameIngredient.nativeElement.value,this.inputAmountIngredient.nativeElement.value))
  // }

  onSubmit(form: NgForm) {
    const value = this.form?.value;
    this.shopListService.onAddItem(new Ingredient(value.name, value.amount))
  }

  onEdit(editForm: NgForm) {

  }
}
