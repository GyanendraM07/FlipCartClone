import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Selleruser } from 'src/app/models/seller-models/selleruser';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiCallService {
  private apiUrl = '/api';  // Updated to use the proxy

  constructor(private http: HttpClient) { }

  sellerRegister(seller: Selleruser): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer token` // Assuming it's a Bearer token
    });
    return this.http.post(`${this.apiUrl}/register`, seller, { headers });
  }

  getAuthLogin(userName: string, password: string): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer token` // Assuming it's a Bearer token
    });
    const params = new HttpParams().set('userName', userName).set('password', password);
    return this.http.get(`${this.apiUrl}/authLogin`, { headers, params })
  }


}
