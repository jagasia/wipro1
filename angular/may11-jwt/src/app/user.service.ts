import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  URL='http://localhost:8080';
  constructor(private http:HttpClient) { }

  signup(user:any)
  {
    return this.http.post(this.URL+"/signup",user);
  }

  login(authRequest:any)
  {
    return this.http.post(this.URL+"/login",authRequest);
  }

  update(user:any)
  {
    console.log(user)
    //steps to send header
    var jwt=localStorage.getItem('token');
    console.log("using token:");
    console.log(jwt);
    
    const httpOptions = {
      headers: new HttpHeaders({
          // 'Content-Type':  'application/json',
           Authorization: 'Bearer ' + jwt,
      })
  };
    return this.http.put(this.URL+"/update",user, httpOptions);
  }
}
