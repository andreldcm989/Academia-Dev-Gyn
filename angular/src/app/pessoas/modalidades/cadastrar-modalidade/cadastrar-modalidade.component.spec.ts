import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarModalidadeComponent } from './cadastrar-modalidade.component';

describe('CadastrarModalidadeComponent', () => {
  let component: CadastrarModalidadeComponent;
  let fixture: ComponentFixture<CadastrarModalidadeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastrarModalidadeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CadastrarModalidadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
