import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlunosComponent } from './alunos/alunos.component';
import { CadastrarAlunoComponent } from './alunos/cadastrar-aluno/cadastrar-aluno.component';
import { InstrutoresComponent } from './instrutores/instrutores.component';

const routes: Routes = [
  { path: 'alunos', component: AlunosComponent },
  { path: 'alunos/cadastro', component: CadastrarAlunoComponent },
  { path: 'instrutores', component: InstrutoresComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PessoasRoutingModule {}
