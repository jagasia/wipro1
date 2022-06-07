import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 @Input() title : string = 'abcd';    //how will  i allow parent component to give value to this variable. ans: @Input() decorator
 @Input() color:string='blue';
  constructor() { }

  ngOnInit(): void {
  }

}
