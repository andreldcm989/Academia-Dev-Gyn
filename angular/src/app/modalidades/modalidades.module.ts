import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModalidadesRoutingModule } from './modalidades-routing.module';
import { ModalidadesComponent } from './modalidades/modalidades.component';
import { MaterialModule } from '../shared/material/material.module';
import { CadastrarModalidadeComponent } from './cadastrar-modalidade/cadastrar-modalidade.component';

@NgModule({
  declarations: [ModalidadesComponent, CadastrarModalidadeComponent],
  imports: [CommonModule, ModalidadesRoutingModule, MaterialModule],
})
export class ModalidadesModule {}
