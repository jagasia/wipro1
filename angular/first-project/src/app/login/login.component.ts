import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string='Raja';
  password:string='Siva';
  color:string='blue';

  constructor() { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    alert("Login function is called")
  }

}
