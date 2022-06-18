import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-airline',
  templateUrl: './airline.component.html',
  styleUrls: ['./airline.component.css']
})
export class AirlineComponent implements OnInit {
 airlineForm:any;
 

  constructor(private fb:FormBuilder, private as:AirlineService) { 
    this.airlineForm=this.fb.group({
      id:[],
      name:[],
      country:[],
      logo:[],
      slogan:[],
      head_quaters:[],
      website:[],
      established:[]
    });
  }

  ngOnInit(): void {
  }

  fnAdd()
  {
    this.as.addAirline(this.airlineForm.value).subscribe((response)=>console.log(response),(error)=>console.log(error));
  }
}
