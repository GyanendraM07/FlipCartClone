import { Component, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material/sidenav';
import { ActivatedRoute, Router } from '@angular/router';
import { FormControl } from '@angular/forms';
import { map, startWith } from 'rxjs/operators';
import { Observable } from 'rxjs';
import * as moment from 'moment';

@Component({
  selector: 'app-seller-dash',
  templateUrl: './seller-dash.component.html',
  styleUrls: ['./seller-dash.component.css']
})
export class SellerDashComponent {
  clickedItem: string | null = null;


  constructor(private router: Router, private activatedRoute: ActivatedRoute) {}

  navigateTo(route: string,item:string): void {
    // Use router to navigate to the specified route within the outlet
    this.clickedItem=item;
    this.router.navigate([route], { relativeTo: this.activatedRoute });
  }
  @ViewChild('sidenav') sidenav?: MatSidenav;
  isExpanded = true;
  seller: boolean = false;
  isShowing = false;
  showSubSubMenu: boolean = false;

  mouseenter() {
    if (!this.isExpanded) {
      this.isShowing = true;
    }
  }

  mouseleave() {
    if (!this.isExpanded) {
      this.isShowing = false;
    }
  }



}
