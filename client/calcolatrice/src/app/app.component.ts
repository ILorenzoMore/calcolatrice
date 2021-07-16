import { Risultato } from './risultato';
import { RequestDto } from './request-dto';
import { ResponseDto } from './response-dto';
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})

export class AppComponent {
	title = 'calcolatrice';
	n1: number = 0;
	n2: number = 0;
	risultato: Risultato = new Risultato();

	constructor(private http: HttpClient) {}

	somma(){
		let r: RequestDto = new RequestDto();
		r.numero1 = this.n1;
		r.numero2 = this.n2;

		let obs: Observable<ResponseDto> =  this.http.post<ResponseDto>('http://localhost:8080/somma', r);

		obs.subscribe(res => {
			this.risultato = res.risultato;
		});
	}
	sottrazione(){
		let r: RequestDto = new RequestDto();
		r.numero1 = this.n1;
		r.numero2 = this.n2;

		let obs: Observable<ResponseDto> =  this.http.post<ResponseDto>('http://localhost:8080/sottrazione', r);

		obs.subscribe(res => {
			this.risultato = res.risultato;
		});
	}
	moltiplicazione(){
		let r: RequestDto = new RequestDto();
		r.numero1 = this.n1;
		r.numero2 = this.n2;

		let obs: Observable<ResponseDto> =  this.http.post<ResponseDto>('http://localhost:8080/moltiplicazione', r);

		obs.subscribe(res => {
			this.risultato = res.risultato;
		});
	}
	divisione(){
		let r: RequestDto = new RequestDto();
		r.numero1 = this.n1;
		r.numero2 = this.n2;

		let obs: Observable<ResponseDto> =  this.http.post<ResponseDto>('http://localhost:8080/divisione', r);

		obs.subscribe(res => {
			this.risultato = res.risultato;
		});
	}
}
