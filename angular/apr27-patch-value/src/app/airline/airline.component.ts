import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-airline',
  templateUrl: './airline.component.html',
  styleUrls: ['./airline.component.css']
})
export class AirlineComponent implements OnInit {
  airlines:any;
  airlineForm:any;

  constructor(private as:AirlineService, private fb:FormBuilder) { 
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
    //get all airlines
    this.as.getAllAirlines().subscribe((data)=>{this.airlines=data},(error)=>{console.log(error)});
  }

  fnSelect(id:any)
  {
    // alert("You have selected "+id);
    //i can find the airline for that id
    this.as.findAirlineById(id).subscribe((data)=>{
      // console.log(data);
      this.airlineForm.patchValue(data);
      // this.airlineForm.controls.id.patchValue(20);
    });
  }

}
