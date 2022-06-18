import { Component, DoCheck, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  isLoggedIn:boolean=false;
  superhero:string='Jag';

  constructor() { }
  

  ngOnInit(): void {
  }

}
