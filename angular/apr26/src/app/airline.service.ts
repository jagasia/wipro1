import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {

  constructor(private http:HttpClient) { }

  fnAdd(airline:any)
  {
    return this.http.post('https://api.instantwebtools.net/v1/airlines',airline);
  }

  fnGetAllAirlines()
  {
    return this.http.get('https://api.instantwebtools.net/v1/airlines');
  }

  fnFindAirlineById(id:any)
  {
    return this.http.get('https://api.instantwebtools.net/v1/airlines/'+id);
  }
}
