import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  firstname='jagadees';
  lastname='india';

  constructor() { }

  ngOnInit(): void {
  }

  fnSignup()
  {
    alert('signup button is clicked')
  }
}
