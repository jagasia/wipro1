import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {
  url:string='https://api.instantwebtools.net/v1/airlines';
  constructor(private http:HttpClient) { }


  findAirlineById(id:number)
  {
    return this.http.get(this.url+"/"+id);
  }

  getAllAirlines()
  {
    return this.http.get(this.url);
  }

  addAirline(airline:any)
  {
    return this.http.post(this.url,airline);
  }
}
