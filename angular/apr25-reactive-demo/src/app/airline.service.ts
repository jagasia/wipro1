import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {

  constructor(private http:HttpClient) { }

  addAirline(airline:any)
  {
   return this.http.post('https://api.instantwebtools.net/v1/airlines',airline);
  }

  getAllAirlines()
  {
    return this.http.get('https://api.instantwebtools.net/v1/airlines');
  }
}
