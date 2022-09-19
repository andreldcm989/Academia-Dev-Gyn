import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalidadesComponent } from './modalidades.component';

describe('ModalidadesComponent', () => {
  let component: ModalidadesComponent;
  let fixture: ComponentFixture<ModalidadesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalidadesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModalidadesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
