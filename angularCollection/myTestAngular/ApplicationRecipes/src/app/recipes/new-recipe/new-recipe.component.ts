import {Component, OnInit} from '@angular/core';
import {FormArray, FormControl, FormGroup} from "@angular/forms";
import {RecipesServiceService} from "../../services/recipes-service.service";

@Component({
  selector: 'app-new-recipe',
  templateUrl: './new-recipe.component.html',
  styleUrls: ['./new-recipe.component.css']
})
export class NewRecipeComponent implements OnInit{

  initForm!:FormGroup;
  formArray = new FormArray([
      new FormGroup({
        'name': new FormControl(null),
      'amount':new FormControl(null)})
  ]);
  constructor(private recipesService:RecipesServiceService) {
  }

  ngOnInit(){
    this.initForm = new FormGroup({
      'image': new FormControl(null),
      'name': new FormControl(null),
      'description': new FormControl(null),
      'ingredients':this.formArray
    })

  }

  onSubmit() {
    this.recipesService.addReceipt(this.initForm.value)
    console.log(this.initForm?.value);
  }
}
