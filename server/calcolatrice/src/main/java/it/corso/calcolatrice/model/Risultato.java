package it.corso.calcolatrice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Risultato{
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private double valore;
	
	public Risultato(){
	}

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public double getValore(){
		return this.valore;
	}

	public void setValore(double valore){
		this.valore = valore;
	}

	@Override
	public String toString(){
		return "Risultato [id=" + this.id + ", valore=" + this.valore + "]";
	}
}
