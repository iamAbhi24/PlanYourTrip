import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule,Validators } from '@angular/forms';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  booking=new Booking;
  msg="";
  constructor(private _service:BookingService,private _route:Router) { }

  ngOnInit(): void {
  }
  
  
  Bookings(){
    //check the user input
    console.log(this.booking);
    console.log(this.booking.email);
    if(this.booking.email !=undefined && this.booking.check_in_date!=undefined && this.booking.check_out_date!=undefined && this.booking.adults!=undefined && this.booking.children!=undefined && this.booking.hotel!=undefined && this.booking.phoneNo!=undefined && this.booking.username!=undefined && this.booking.state!=undefined)
    {
  

  
  this._service.bookingFromRemote(this.booking).subscribe(
    data=>{
      console.log("response received");
    this._route.navigate(['/payment']);
  },
    error => {
      console.log("exception occured");
    this.msg="Enter Full Name";}
  );
    }
    else{
      alert("Fill the details carefully.");
    }
    }
  
  

}
