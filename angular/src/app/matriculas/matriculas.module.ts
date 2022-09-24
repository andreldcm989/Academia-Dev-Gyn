import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MatriculasRoutingModule } from './matriculas-routing.module';
import { MatriculasComponent } from './matriculas.component';

@NgModule({
  declarations: [MatriculasComponent],
  imports: [CommonModule, MatriculasRoutingModule],
})
export class MatriculasModule {}
