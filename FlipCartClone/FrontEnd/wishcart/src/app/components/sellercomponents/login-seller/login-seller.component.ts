import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiCallService } from 'src/app/services/seller-services/api-call.service';

@Component({
  selector: 'app-login-seller',
  templateUrl: './login-seller.component.html',
  styleUrls: ['./login-seller.component.css']
})
export class LoginSellerComponent {

  username: string = '';
  password: string = '';
  isloggedIn: Boolean = false
  message: string = ''

  constructor(private router: Router, private sellerApiService: ApiCallService) { }
  ngOnInit() { // Fix here
    sessionStorage.removeItem('sellerLoggedIn');
    debugger;
  }
  login(data: any) {
    this.sellerApiService.getAuthLogin(this.username,this.password).subscribe(
      {
        next: (response) => {
          if(response.status===200){
            this.isloggedIn = true;
            sessionStorage.setItem('sellerLoggedIn', 'true');
            this.router.navigate(['/seller-dash']);
          }
        },
        error(err) {
          console.log(err);
        },
        complete(){

        }
      }
    )
  }

}
