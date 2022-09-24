import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MatriculasComponent } from './matriculas.component';

const routes: Routes = [
  { path: 'matriculas', component: MatriculasComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MatriculasRoutingModule {}
