import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunosComponent } from './alunos/alunos.component';
import { InstrutoresComponent } from './instrutores/instrutores.component';
import { AvaliacoesComponent } from './alunos/avaliacoes/avaliacoes.component';

@NgModule({
  declarations: [AlunosComponent, InstrutoresComponent, AvaliacoesComponent],
  imports: [CommonModule],
})
export class PessoasModule {}
