import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TurmasRoutingModule } from './turmas-routing.module';
import { TurmasComponent } from './turmas.component';

@NgModule({
  declarations: [TurmasComponent],
  imports: [CommonModule, TurmasRoutingModule],
})
export class TurmasModule {}
