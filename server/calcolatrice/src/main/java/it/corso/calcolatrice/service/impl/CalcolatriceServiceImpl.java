package it.corso.calcolatrice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.calcolatrice.model.Risultato;
import it.corso.calcolatrice.repository.RisultatoRepository;
import it.corso.calcolatrice.service.CalcolatriceService;

@Service
public class CalcolatriceServiceImpl implements CalcolatriceService{
	@Autowired
	RisultatoRepository risultatoRepository;

	@Override
	public Risultato somma(double n1, double n2){
		Risultato r = new Risultato();
		r.setValore(n1 + n2);
		risultatoRepository.save(r);
		return r;
	}

	@Override
	public Risultato sottrazione(double n1, double n2){
		Risultato r = new Risultato();
		r.setValore(n1 - n2);
		risultatoRepository.save(r);
		return r;
	}

	@Override
	public Risultato moltiplicazione(double n1, double n2){
		Risultato r = new Risultato();
		r.setValore(n1 * n2);
		risultatoRepository.save(r);
		return r;
	}

	@Override
	public Risultato divisione(double n1, double n2){
		Risultato r = new Risultato();
		if(n2 == 0){
			r.setValore(0);
		}
		else {
			r.setValore(n1 / n2);
		}
		risultatoRepository.save(r);
		return r;
	}

	@Override
	public void clean(){
		risultatoRepository.deleteAll();
		return;
	}
}
