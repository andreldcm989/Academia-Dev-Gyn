import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PessoasRoutingModule } from './pessoas-routing.module';
import { AlunosComponent } from './alunos/alunos.component';
import { InstrutoresComponent } from './instrutores/instrutores.component';
import { PessoasComponent } from './pessoas/pessoas.component';
import { CadastrarAlunoComponent } from './alunos/cadastrar-aluno/cadastrar-aluno.component';
import { CadastrarModalidadeComponent } from './modalidades/cadastrar-modalidade/cadastrar-modalidade.component';

@NgModule({
  declarations: [AlunosComponent, InstrutoresComponent, PessoasComponent, CadastrarAlunoComponent, CadastrarModalidadeComponent],
  imports: [CommonModule, PessoasRoutingModule],
})
export class PessoasModule {}
