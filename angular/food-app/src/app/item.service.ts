import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ItemService {
  URL='http://localhost:8383/item';
  constructor(private http:HttpClient) { }

  retrieveCategories()
  {
    return this.http.get(this.URL+"/categories");
  }

  retrieveAllItems():Observable<any>
  {
    return this.http.get(this.URL);
  }

  findItemById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }

  addItem1(item:any)
  {
    return this.http.post(this.URL+"/add",item);
  }

  addItem(item:any)
  {
    return this.http.post(this.URL,item);
  }

  updateItem1(item:any)
  {
    return this.http.put(this.URL+"/update",item);
  }

  updateItem(item:any)
  {
    return this.http.put(this.URL,item);
  }


  deleteItem(id:number)
  {
    return this.http.delete(this.URL+"/"+id);
  }
}
