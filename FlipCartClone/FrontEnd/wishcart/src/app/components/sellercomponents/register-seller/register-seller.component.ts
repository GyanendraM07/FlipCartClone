import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Selleruser } from 'src/app/models/seller-models/selleruser';
import { ApiCallService } from 'src/app/services/seller-services/api-call.service';

@Component({
  selector: 'app-register-seller',
  templateUrl: './register-seller.component.html',
  styleUrls: ['./register-seller.component.css']
})
export class RegisterSellerComponent {
  isLinear = true;
  selleruser=new Selleruser();
  firstFormGroup!: FormGroup;
  secondFormGroup!: FormGroup;
  thirdFormGroup!: FormGroup;


  constructor(private _formBuilder: FormBuilder,private sellerApiService:ApiCallService) { }

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      mobileNo: ['', Validators.required],
      emailId: ['', Validators.required],
      gstNo: ['', Validators.required]
    });

    this.secondFormGroup = this._formBuilder.group({
      companyname: ['', Validators.required],
      address: ['', Validators.required],
      registration: ['', Validators.required]
    });

    this.thirdFormGroup = this._formBuilder.group({
      email2: [''],
      password: ['', Validators.required],
      cpassword: ['', Validators.required]
    });
  }

  isFirstStepValid() {
    return this.firstFormGroup.valid;
  }

  isSecondStepValid() {
    return this.secondFormGroup.valid;
  }

  isThirdStepValid() {
    return this.thirdFormGroup.valid;
  }

  onSubmit() {
    if (this.isFirstStepValid() && this.isSecondStepValid() && this.isThirdStepValid()) {
      debugger;
      this.selleruser.email=this.firstFormGroup.value.emailId;
      this.selleruser.contactNumber=this.firstFormGroup.value.mobileNo;
      this.selleruser.gstNumber=this.firstFormGroup.value.gstNo;
      this.selleruser.companyName=this.secondFormGroup.value.companyname;
      this.selleruser.companyAddress=this.secondFormGroup.value.address;
      this.selleruser.registrationNumber=this.secondFormGroup.value.registration;
      this.selleruser.password=this.thirdFormGroup.value.password;
      this.sellerApiService.sellerRegister(this.selleruser).subscribe(
        {
          next: (response)=> {
            
          },
          error(err) {
            console.log(err)
          },
          complete() {
            console.log("api call Completed ")
          },
        }
      )
    }
  }
}
