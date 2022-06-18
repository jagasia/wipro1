import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employeeForm:any;
  constructor(private fb:FormBuilder) { 
    this.employeeForm=this.fb.group({
      id:[],
      firstName:[],
      lastName:[],
      salary:[]
    });
  }

  ngOnInit(): void {
  }

}
