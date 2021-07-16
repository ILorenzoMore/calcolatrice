package it.corso.calcolatrice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.corso.calcolatrice.dto.CalcolatriceRichiestaDto;
import it.corso.calcolatrice.dto.CalcolatriceRispostaDto;
import it.corso.calcolatrice.model.Risultato;
import it.corso.calcolatrice.service.CalcolatriceService;

@CrossOrigin("*")
@RestController
public class CalcolatriceController{
	@Autowired
	CalcolatriceService cs;
	
	@RequestMapping("/somma")
	@ResponseBody
	public CalcolatriceRispostaDto aggiungi(@RequestBody CalcolatriceRichiestaDto req){
		cs.clean();
		Risultato r = cs.somma(req.getNumero1(), req.getNumero2());
		CalcolatriceRispostaDto res = new CalcolatriceRispostaDto();
		res.setRisultato(r);
		return res;
	}

	@RequestMapping("/sottrazione")
	@ResponseBody
	public CalcolatriceRispostaDto sottrazione(@RequestBody CalcolatriceRichiestaDto req){
		cs.clean();
		Risultato r = cs.sottrazione(req.getNumero1(), req.getNumero2());
		CalcolatriceRispostaDto res = new CalcolatriceRispostaDto();
		res.setRisultato(r);
		return res;
	}

	@RequestMapping("/moltiplicazione")
	@ResponseBody
	public CalcolatriceRispostaDto moltiplicazione(@RequestBody CalcolatriceRichiestaDto req){
		cs.clean();
		Risultato r = cs.moltiplicazione(req.getNumero1(), req.getNumero2());
		CalcolatriceRispostaDto res = new CalcolatriceRispostaDto();
		res.setRisultato(r);
		return res;
	}

	@RequestMapping("/divisione")
	@ResponseBody
	public CalcolatriceRispostaDto divisione(@RequestBody CalcolatriceRichiestaDto req){
		cs.clean();
		Risultato r = cs.divisione(req.getNumero1(), req.getNumero2());
		CalcolatriceRispostaDto res = new CalcolatriceRispostaDto();
		res.setRisultato(r);
		return res;
	}
}
