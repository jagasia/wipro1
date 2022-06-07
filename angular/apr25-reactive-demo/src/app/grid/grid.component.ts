import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-grid',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.css']
})
export class GridComponent implements OnInit {
   airlines:any;
  constructor(private as:AirlineService) { }

  ngOnInit(): void {
    this.as.getAllAirlines().subscribe((x)=>this.airlines=x);
  }

}
