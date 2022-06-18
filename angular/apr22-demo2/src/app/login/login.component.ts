import { Component, EventEmitter, OnInit, Output } from '@angular/core';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  str='abcdef';
  username:string='';
  password:string='';
  f=12.36545454;
  arr:string[]=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"];

  today:Date=new Date();

  @Output() loginEvent=new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    this.loginEvent.emit(this.username+":"+this.password);
  }

}
