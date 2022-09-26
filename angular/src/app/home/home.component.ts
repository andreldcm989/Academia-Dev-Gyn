import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  constructor(private rota: Router) {}

  modalidades() {
    this.rota.navigate(['/modalidades']);
  }
  turmas() {
    this.rota.navigate(['/turmas']);
  }
  instrutores() {
    this.rota.navigate(['/instrutores']);
  }
  matriculas() {
    this.rota.navigate(['/matriculas']);
  }
  alunos() {
    this.rota.navigate(['/alunos']);
  }
}
