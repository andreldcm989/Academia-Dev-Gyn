import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'modalidades', pathMatch: 'full' },
  {
    path: 'modalidades',
    loadChildren: () =>
      import('./modalidades/modalidades.module').then(
        (m) => m.ModalidadesModule
      ),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
