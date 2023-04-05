import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bookinginfo } from '../bookinginfo';
// export class Mybooking{
//   constructor(
//     private  userid:number,
//     private  username:string,
//     private  phoneNo:number,
//     private  age:number,
//     private  email:string,
//     private  adults:number,
//     private  children:number,
//     private  amount:number,
// 	private   check_in_date:string,
// 	private   check_out_date:string,
// 	private  state:string,
//     private hotel:string
//   ){
    
//   }
//}
@Component({
  selector: 'app-mybooking',
  templateUrl: './mybooking.component.html',
  styleUrls: ['./mybooking.component.css']
})
export class MybookingComponent implements OnInit {
  mybooking:Bookinginfo[];
  deleteUser: any;
  constructor(
    private httpClient:HttpClient,
    private router:Router
    ) { }

  ngOnInit(): void {
    this.getbookinfo();
  }

  getbookinfo()
  {
    this.httpClient.get<any>('http://localhost:8080/user/all').subscribe(
      response =>{
        console.log(response);
        this.mybooking = response;
      }
    );
  }

  deleteBooking(userid:number)
  {
    if(confirm("Are you want to delete your booking")){
    this.httpClient.delete<any>('http://localhost:8080/user/delete/'+userid).subscribe(
      response =>{
        console.log(response);
       // this.router.navigate(['/mybooking']);
        window.location.reload();
      }
    );

    }
  }

  // cancelUser(userid: number){
  //   this.httpClient.deleteUser(userid)
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.getbookinfo();
          
  //       },
  //       error => console.log(error));
  // }

}
