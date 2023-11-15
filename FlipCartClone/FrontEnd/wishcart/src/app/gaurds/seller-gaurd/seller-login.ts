import { inject } from '@angular/core';
import { Router } from '@angular/router';
import { tap } from 'rxjs';

export const sellerLoginGaurd = () => {
  const router = inject(Router);
  debugger;
  const isLoggedIn = sessionStorage.getItem('sellerLoggedIn');
  if (isLoggedIn) {
    return true;
  } else {
    router.navigate(['/seller-login'])
    return false;
  }
}