import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './shared/material/material.module';
import { HttpClientModule } from '@angular/common/http';
import { HomeModule } from './home/home.module';
import { MatriculasModule } from './matriculas/matriculas.module';
import { PessoasModule } from './pessoas/pessoas.module';
import { TurmasModule } from './turmas/turmas.module';
import { ModalidadesModule } from './modalidades/modalidades.module';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    HomeModule,
    MatriculasModule,
    ModalidadesModule,
    PessoasModule,
    TurmasModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
