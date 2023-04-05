import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegisterService } from '../register.service';
import { Router } from '@angular/router';
import { Register } from '../register';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {
register=new Register();
msg="";

  constructor(private _service: RegisterService , private _route :Router) { }

  ngOnInit(): void {

  }

  loginUser(){

    this._service.registerUserFromRemote(this.register).subscribe({
      next:(data)=>{

      },
      error:(e)=>{
        console.log(this.register);
        console.log(e);
      }
    });
    this._route.navigate([''])
  }}