import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Booking } from './booking';


@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private _http:HttpClient) { }
  public bookingFromRemote(booking :Booking):Observable<any>{
    return this._http.post<any>("http://localhost:8080/user/add",booking);
    }
   
  
}
