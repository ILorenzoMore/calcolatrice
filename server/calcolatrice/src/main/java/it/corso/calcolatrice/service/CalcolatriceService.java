package it.corso.calcolatrice.service;

import it.corso.calcolatrice.model.Risultato;

public interface CalcolatriceService{
	Risultato somma(double n1, double n2);
	Risultato sottrazione(double n1, double n2);
	Risultato moltiplicazione(double n1, double n2);
	Risultato divisione(double n1, double n2);
	void clean();
}
