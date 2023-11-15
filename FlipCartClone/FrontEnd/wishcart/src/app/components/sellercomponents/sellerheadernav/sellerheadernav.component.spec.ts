import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SellerheadernavComponent } from './sellerheadernav.component';

describe('SellerheadernavComponent', () => {
  let component: SellerheadernavComponent;
  let fixture: ComponentFixture<SellerheadernavComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SellerheadernavComponent]
    });
    fixture = TestBed.createComponent(SellerheadernavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
