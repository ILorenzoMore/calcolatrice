import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Risultato } from './risultato';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'calcolatrice';
  numero1: number = 0;
  numero2: number = 0;
  risultato: Risultato = new Risultato();
}

constructor (private http: HttpClient) {}

somma() {
  let ox: Observable<Risultato> = this.http.post<Risultato>("http://localhost:8080/somma", this.numero1 , this.numero2);
    ox.subscribe(r => this.risultato = r);
  }

differenza() {
  let ox: Observable<Risultato> = this.http.post<Risultato>("http://localhost:8080/differenza", this.numero1 , this.numero2);
    ox.subscribe(r => this.risultato = r);
  }

moltiplicazione() {
  let ox: Observable<Risultato> = this.http.post<Risultato>("http://localhost:8080/moltiplicazione", this.numero1 , this.numero2);
    ox.subscribe(r => this.risultato = r);
  }

divisione() {
  let ox: Observable<Risultato> = this.http.post<Risultato>("http://localhost:8080/divisione", this.numero1 , this.numero2);
    ox.subscribe(r => this.risultato = r);
  }