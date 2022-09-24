import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PessoasRoutingModule } from './pessoas-routing.module';
import { AlunosComponent } from './alunos/alunos.component';
import { InstrutoresComponent } from './instrutores/instrutores.component';

@NgModule({
  declarations: [AlunosComponent, InstrutoresComponent],
  imports: [CommonModule, PessoasRoutingModule],
})
export class PessoasModule {}
