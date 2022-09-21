import { TestBed } from '@angular/core/testing';

import { ModalidadesService } from './modalidades.service';

describe('ModalidadesService', () => {
  let service: ModalidadesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ModalidadesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
