import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TurmasComponent } from './turmas.component';

const routes: Routes = [{ path: 'turmas', component: TurmasComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TurmasRoutingModule {}
