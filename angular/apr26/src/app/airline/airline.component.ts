import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-airline',
  templateUrl: './airline.component.html',
  styleUrls: ['./airline.component.css']
})
export class AirlineComponent implements OnInit {
  airlineForm:any;

  constructor(private fb:FormBuilder) { 
    this.airlineForm=this.fb.group(
      {
        id:['',[Validators.required, Validators.min(100)]],
        name:['',[Validators.required, Validators.minLength(5)]],
        country:[],
        logo:[],
        slogan:[],
        head_quaters:[], 
        website:[],
        established:['',[Validators.required,Validators.min(1900),Validators.max(2022)]]
      });
  }

  ngOnInit(): void {
  }

  get f()
  {
    return this.airlineForm.controls;
  }

}
