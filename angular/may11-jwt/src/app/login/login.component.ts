import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;
  constructor(private fb:FormBuilder, private us:UserService) { 
    this.loginForm=this.fb.group({
      username:[],
      password:[]
    });
  }

  ngOnInit(): void {
  }

  fnLogin()
  {
    var x:any;
    this.us.login(this.loginForm.value).subscribe((data)=>{
      console.log(data);
      x=data;
      if(x.jwt=='Login Failed')
      {
        alert('Login Failed');
      }else{
        //store the jwt token in localStorage
        localStorage.setItem('token',x.jwt);
        alert("Login is successful.Token stored in localStorage")
      }
    });
  }
}
