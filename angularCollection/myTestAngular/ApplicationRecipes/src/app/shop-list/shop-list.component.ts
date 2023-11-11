import {Component, OnInit} from '@angular/core';
import {Ingredient} from "../models/ingredient.model";
import {ShoplistService} from "../services/shoplist.service";

@Component({
  selector: 'app-shop-list',
  templateUrl: './shop-list.component.html',
  styleUrls: ['./shop-list.component.css'],
  providers:[]
})

export class ShopListComponent implements OnInit {

  ingredientsList!:Ingredient[];

  constructor(private serviceShopList : ShoplistService) {
  }

  ngOnInit() {
    this.ingredientsList = this.serviceShopList.getList();
    // ! ShopList si è correttamente registrata all'evento emesso dal service
    this.serviceShopList.newIngredient.subscribe(
      (ingredients:Ingredient[]) => {
        this.ingredientsList = ingredients
      }
    );
  }
}
