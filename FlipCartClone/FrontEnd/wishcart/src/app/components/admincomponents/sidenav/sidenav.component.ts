import { Component, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material/sidenav';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent {

  constructor(private router: Router, private activatedRoute: ActivatedRoute) {}

  navigateTo(route: string): void {
    // Use router to navigate to the specified route within the outlet
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
