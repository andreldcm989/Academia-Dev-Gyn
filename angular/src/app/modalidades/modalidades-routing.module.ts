import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModalidadesComponent } from './modalidades/modalidades.component';

const routes: Routes = [
  { path: 'modalidades', component: ModalidadesComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ModalidadesRoutingModule {}
