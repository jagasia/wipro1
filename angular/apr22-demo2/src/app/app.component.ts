import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'apr22-demo2';

  fn1(x:string)
  {
    var arr=x.split(":");

    alert("THe user name is "+arr[0]);
    alert("THe password is "+arr[1]);
  }
}
