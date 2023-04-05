import { Component, OnInit } from '@angular/core';
import { LoginpageService } from '../loginpage.service';
import { Loginpage } from '../loginpage';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registerpage',
  templateUrl: './registerpage.component.html',
  styleUrls: ['./registerpage.component.css']
})
export class RegisterpageComponent implements OnInit {

  loginpage=new Loginpage;
msg="";

  constructor(private _service: LoginpageService , private _route :Router) { }

  ngOnInit(): void {
  }

  registerUser(){
     console.log("this.loginpage");
    this._service.loginUserFromRemote(this.loginpage).subscribe
    (
      data =>
      {
       
        console.log("response received");
        this._route.navigate(['/loginpage']);
      },
      error =>
      {
        console.log("exception occured");
        this.msg=error.error;
      }
    )
  }

}
