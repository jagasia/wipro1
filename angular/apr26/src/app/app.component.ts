import { Component, OnInit } from '@angular/core';
import { AirlineService } from './airline.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
  airlines:any;

  title = 'apr26';

  constructor(private as:AirlineService)
  {
    this.as.fnGetAllAirlines().subscribe((data)=>this.airlines=data);
  }

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
}
