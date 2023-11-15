import { TestBed } from '@angular/core/testing';

import { AdminApicallService } from './admin-apicall.service';

describe('AdminApicallService', () => {
  let service: AdminApicallService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminApicallService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
