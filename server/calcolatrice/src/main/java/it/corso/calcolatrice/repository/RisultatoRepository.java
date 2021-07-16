package it.corso.calcolatrice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.corso.calcolatrice.model.Risultato;

@Repository
public interface RisultatoRepository extends JpaRepository<Risultato, Long>{
}
