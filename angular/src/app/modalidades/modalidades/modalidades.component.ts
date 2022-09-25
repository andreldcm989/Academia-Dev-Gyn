import { Dialog } from '@angular/cdk/dialog';
import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Observable } from 'rxjs';
import { CadastrarModalidadeComponent } from 'src/app/pessoas/modalidades/cadastrar-modalidade/cadastrar-modalidade.component';
import { PessoasComponent } from 'src/app/pessoas/pessoas/pessoas.component';
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

  constructor(private service: ModalidadesService, private dialogo: MatDialog) {
    this.atualizarTabela();
  }

  janelaCadastro() {
    this.dialogo.open(CadastrarModalidadeComponent);
  }

  atualizarTabela() {
    this.modalidades$ = this.service.listarModalidades();
  }
}
