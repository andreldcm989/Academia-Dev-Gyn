import { Component } from '@angular/core';
import { Modalidade } from '../model/modalidade';

@Component({
  selector: 'app-modalidades',
  templateUrl: './modalidades.component.html',
  styleUrls: ['./modalidades.component.css'],
})
export class ModalidadesComponent {
  ordemColunas: string[] = ['id', 'nomeModalidade', 'dataCriacao', 'opcoes'];
  modalidades: Modalidade[] = [
    { _id: 1, nomeModalidade: 'Natação', dataCriacao: '19/09/2022' },
    { _id: 2, nomeModalidade: 'Hidroginástica', dataCriacao: '19/09/2022' },
    { _id: 3, nomeModalidade: 'CrossFit', dataCriacao: '19/09/2022' },
    { _id: 4, nomeModalidade: 'Pilates', dataCriacao: '19/09/2022' },
  ];
}
