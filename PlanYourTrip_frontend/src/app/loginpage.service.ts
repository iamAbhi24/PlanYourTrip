import { HttpClient }from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Loginpage } from './loginpage';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginpageService {

 
  constructor(private _http :HttpClient) { }

 // calling from java end points
 public loginUserFromRemote(loginpage:Loginpage):Observable<any>
 {
  return this._http.post<any>("http://localhost:8080/signup",loginpage);    
 } 



}
