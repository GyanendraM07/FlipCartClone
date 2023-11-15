import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerheaderComponent } from './components/customercomponents/customerheader/customerheader.component';
import { RegisterSellerComponent } from './components/sellercomponents/register-seller/register-seller.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SellerheadernavComponent } from './components/sellercomponents/sellerheadernav/sellerheadernav.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatStepperModule} from '@angular/material/stepper';
import { HttpClientModule } from '@angular/common/http';
import { AdminloginComponent } from './components/admincomponents/adminlogin/adminlogin.component';
import { MatCardModule } from '@angular/material/card';
import { SidenavComponent } from './components/admincomponents/sidenav/sidenav.component';
import { MatButtonModule } from '@angular/material/button';
import { SellerRequestComponent } from './components/admincomponents/seller-request/seller-request.component';
import { LoginSellerComponent } from './components/sellercomponents/login-seller/login-seller.component';
import { SellerDashComponent } from './components/sellercomponents/seller-dash/seller-dash.component';
import { AddProductComponent } from './components/sellercomponents/add-product/add-product.component';
import { ManageProductsComponent } from './components/sellercomponents/manage-products/manage-products.component';
import { OrdersComponent } from './components/sellercomponents/orders/orders.component';
import { RequestComponent } from './components/sellercomponents/request/request.component';
import {NgFor, AsyncPipe} from '@angular/common';
import {MatAutocompleteModule} from '@angular/material/autocomplete';



@NgModule({
  declarations: [
    AppComponent,
    CustomerheaderComponent,
    RegisterSellerComponent,
    SellerheadernavComponent,
    AdminloginComponent,
    SidenavComponent,
    SellerRequestComponent,
    LoginSellerComponent,
    SellerDashComponent,
    AddProductComponent,
    ManageProductsComponent,
    OrdersComponent,
    RequestComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatListModule,
    MatIconModule,
    MatSidenavModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatStepperModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    HttpClientModule,
    MatCardModule,
    MatToolbarModule,
    FormsModule,
    MatAutocompleteModule,
    ReactiveFormsModule,
    NgFor,
    AsyncPipe,
    NgxDaterangepickerMd,
    ReactiveFormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
