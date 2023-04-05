import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterpageComponent } from './registerpage/registerpage.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { MybookingComponent } from './mybooking/mybooking.component';
import { BookingComponent } from './booking/booking.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentsuccessComponent } from './paymentsuccess/paymentsuccess.component';
import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import { HomeComponent } from './user/home/home.component';
@NgModule({   
  declarations: [
    AppComponent,
    HomeComponent,
    LoginpageComponent,
    RegisterpageComponent,
    MybookingComponent,
    BookingComponent,
    PaymentComponent,
    PaymentsuccessComponent,
    
  ],
  imports: [
    FormsModule,
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
