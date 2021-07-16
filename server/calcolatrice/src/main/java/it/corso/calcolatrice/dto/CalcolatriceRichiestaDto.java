package it.corso.calcolatrice.dto;

public class CalcolatriceRichiestaDto{
	private double numero1;
	private double numero2;

	public CalcolatriceRichiestaDto(){}

	public double getNumero1(){
		return this.numero1;
	}

	public void setNumero1(double numero1){
		this.numero1 = numero1;
	}

	public double getNumero2(){
		return this.numero2;
	}

	public void setNumero2(double numero2){
		this.numero2 = numero2;
	}

	@Override
	public String toString(){
		return "CalcolatriceRichiestaDto [numero1=" + this.numero1 + ", numero2=" + this.numero2 + "]";
	}
}
