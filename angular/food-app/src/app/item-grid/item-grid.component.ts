import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item-grid',
  templateUrl: './item-grid.component.html',
  styleUrls: ['./item-grid.component.css']
})
export class ItemGridComponent implements OnInit {
  items:any;
  constructor(private is:ItemService) { }

  ngOnInit(): void {
    this.is.retrieveAllItems().subscribe((data)=>{
      console.log(data);
      
      this.items=data;
    });
  }

}
