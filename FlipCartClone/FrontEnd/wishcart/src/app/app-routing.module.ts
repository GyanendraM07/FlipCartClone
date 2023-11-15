import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerheaderComponent } from './components/customercomponents/customerheader/customerheader.component';
import { SellerheadernavComponent } from './components/sellercomponents/sellerheadernav/sellerheadernav.component';
import { RegisterSellerComponent } from './components/sellercomponents/register-seller/register-seller.component';
import { AdminloginComponent } from './components/admincomponents/adminlogin/adminlogin.component';
import { SidenavComponent } from './components/admincomponents/sidenav/sidenav.component';
import { SellerRequestComponent } from './components/admincomponents/seller-request/seller-request.component';
import { LoginSellerComponent } from './components/sellercomponents/login-seller/login-seller.component';
import { SellerDashComponent } from './components/sellercomponents/seller-dash/seller-dash.component';
import { sellerLoginGaurd } from './gaurds/seller-gaurd/seller-login';
import { AddProductComponent } from './components/sellercomponents/add-product/add-product.component';
import { ManageProductsComponent } from './components/sellercomponents/manage-products/manage-products.component';
import { OrdersComponent } from './components/sellercomponents/orders/orders.component';
import { RequestComponent } from './components/sellercomponents/request/request.component';


const routes: Routes = [
  { path: '', component: CustomerheaderComponent },
  { path: 'seller', component: SellerheadernavComponent },
  { path: 'res-seller', component: RegisterSellerComponent },
  { path: 'seller-login', component: LoginSellerComponent },
  {
    path: 'seller-dash', component: SellerDashComponent,
    children:[{ path: 'add-product', component: AddProductComponent },
    { path: 'manage-product', component: ManageProductsComponent },
    { path: 'orders', component: OrdersComponent },
    { path: 'raise-request', component: RequestComponent },
  ],
    // canActivate: [sellerLoginGaurd]
  },
  { path: 'admin-auth', component: AdminloginComponent },
  {
    path: 'admin-dash', component: SidenavComponent,
    children: [
      { path: 'sell-request', component: SellerRequestComponent }
      // Add more child routes as needed
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
