import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  updateForm:any;
  constructor(private fb:FormBuilder, private us:UserService) { 
    this.updateForm=this.fb.group({
      username:[],
      password:[],
      cpassword:[],
      firstName:[],
      lastName:[],
      email:[]
    });
  }
  ngOnInit(): void {
  }

  fnUpdate()
  {
    console.log(this.updateForm.value);
    this.us.update(this.updateForm.value).subscribe((data)=>{
      console.log(data);
    })
    
  }
}
