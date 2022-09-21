import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Modalidade } from '../model/modalidade';

@Injectable({
  providedIn: 'root',
})
export class ModalidadesService {
  private readonly url: string = 'api/academia/modalidades';

  constructor(private httpClient: HttpClient) {}

  listarModalidades(): Observable<Modalidade[]> {
    return this.httpClient.get<Modalidade[]>(this.url);
  }
}
