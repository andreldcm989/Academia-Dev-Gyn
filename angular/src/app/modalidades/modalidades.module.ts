import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModalidadesRoutingModule } from './modalidades-routing.module';
import { ModalidadesComponent } from './modalidades/modalidades.component';
import { MaterialModule } from '../shared/material/material.module';

@NgModule({
  declarations: [ModalidadesComponent],
  imports: [CommonModule, ModalidadesRoutingModule, MaterialModule],
})
export class ModalidadesModule {}
