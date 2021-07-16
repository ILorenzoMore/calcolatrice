package it.corso.calcolatrice.dto;

import it.corso.calcolatrice.model.Risultato;

public class CalcolatriceRispostaDto{
	private Risultato risultato;

	public CalcolatriceRispostaDto(){}

	public Risultato getRisultato(){
		return this.risultato;
	}

	public void setRisultato(Risultato risultato){
		this.risultato = risultato;
	}

	@Override
	public String toString(){
		return "CalcolatriceRispostaDto [risultato=" + this.risultato + "]";
	}
}
