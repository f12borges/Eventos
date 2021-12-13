package br.com.borges.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.borges.eventos.models.Convidado;
import br.com.borges.eventos.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
}
