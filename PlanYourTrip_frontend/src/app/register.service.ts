import { HttpClient }from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Register } from './register';


@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private _http :HttpClient) { }
  public registerUserFromRemote(register:Register):Observable<any>
  {
   return this._http.post<any>("http://localhost:8080/signin",register); 
  }
}
