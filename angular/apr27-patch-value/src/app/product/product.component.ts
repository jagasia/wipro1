import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  // templateUrl: './product.component.html',
  template:`<h2>Product component  </h2>
  <h3>Sub title here</h3>
  `,
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
