import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  username:string='arun';
  color:string='blue';
  status:boolean=false;
  
   x='form-control'
  constructor() { }

  ngOnInit(): void {
  }

}
