import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InstrutoresComponent } from './instrutores.component';

describe('InstrutoresComponent', () => {
  let component: InstrutoresComponent;
  let fixture: ComponentFixture<InstrutoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InstrutoresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InstrutoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
