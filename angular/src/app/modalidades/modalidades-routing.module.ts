import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModalidadesComponent } from './modalidades/modalidades.component';
import { MatTableModule } from '@angular/material/table';
import { Modalidade } from './model/modalidade';

const routes: Routes = [{ path: '', component: ModalidadesComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes), MatTableModule],
  exports: [RouterModule],
})
export class ModalidadesRoutingModule {}
