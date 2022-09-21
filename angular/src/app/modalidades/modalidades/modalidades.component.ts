import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Modalidade } from '../model/modalidade';
import { ModalidadesService } from '../services/modalidades.service';

@Component({
  selector: 'app-modalidades',
  templateUrl: './modalidades.component.html',
  styleUrls: ['./modalidades.component.css'],
})
export class ModalidadesComponent {
  ordemColunas: string[] = ['id', 'nomeModalidade', 'dataCriacao', 'opcoes'];
  modalidades$: Observable<Modalidade[]> | null = null;

  constructor(private service: ModalidadesService) {
    this.atualizarTabela();
  }

  atualizarTabela() {
    this.modalidades$ = this.service.listarModalidades();
  }
}
