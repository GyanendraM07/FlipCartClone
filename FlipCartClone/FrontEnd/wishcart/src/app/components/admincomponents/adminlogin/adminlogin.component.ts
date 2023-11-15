import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent {

  username:string='';
password:string='';
isloggedIn:Boolean=false
message:string=''

  constructor(private router: Router) { }
  login(data:any){
    this.router.navigate(['/dashboard']);
  }
}
