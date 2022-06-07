import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {
  itemForm:any;
  categories:any;
  selectedFile:File=new File([],'');

  constructor(private fb:FormBuilder, private is:ItemService) { 
    this.itemForm=this.fb.group({
      id:[],
      name:[],
      price:[],
      category:[],
      picture:[]
    });
  }

  ngOnInit(): void {
    this.is.retrieveCategories().subscribe((data)=>{
      this.categories=data;
    })
  }

  
onFileChanged(event:any)
{
  this.selectedFile=event.target.files[0];
  // console.log(JSON.stringify(this.selectedFile));
  console.log(this.selectedFile);
  
}

  addItem()
  {
    // console.log(this.itemForm.value);
    const formData=new FormData();
    formData.append('name',this.itemForm.controls.name.value);
    formData.append('price',this.itemForm.controls.price.value);
    formData.append('category',this.itemForm.controls.category.value);
    formData.append('picture',this.selectedFile);
    
    this.is.addItem1(formData).subscribe((data)=>{
      console.log(data);
      
    })

    // this.is.addItem(this.itemForm.value).subscribe((data)=>{
    //   console.log(data);
      
    // });
  }

  updateItem()
  {
    // this.is.updateItem(this.itemForm.value).subscribe((data)=>{
    //   console.log(data);
    // });

    const formData=new FormData();
    formData.append('id',this.itemForm.controls.id.value);
    formData.append('name',this.itemForm.controls.name.value);
    formData.append('price',this.itemForm.controls.price.value);
    formData.append('category',this.itemForm.controls.category.value);
    formData.append('picture',this.selectedFile);
    
    this.is.updateItem1(formData).subscribe((data)=>{
      console.log(data);
      
    })

    

  }

  deleteItem()
  {
    // console.log(this.itemForm.controls.id.value);
    // console.log(this.itemForm.controls['id'].value);
    this.is.deleteItem(this.itemForm.controls.id.value).subscribe((data)=>{
      console.log(data);
    })    
  }
}
