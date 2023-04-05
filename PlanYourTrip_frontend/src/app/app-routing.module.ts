import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './user/home/home.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { RegisterpageComponent } from './registerpage/registerpage.component';
import { MybookingComponent } from './mybooking/mybooking.component';
import { BookingComponent } from './booking/booking.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentsuccessComponent } from './paymentsuccess/paymentsuccess.component';

const routes: Routes = [

  {path:"loginpage", component:LoginpageComponent},
  {path:"registerpage", component:RegisterpageComponent},
  {path:"booking", component:BookingComponent},
  {path:"mybooking", component:MybookingComponent},
  {path:"payment", component: PaymentComponent},
  {path:"paymentsuccess", component:PaymentsuccessComponent},
  {path:"", component:HomeComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
 }
