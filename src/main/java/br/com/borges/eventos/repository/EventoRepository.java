package br.com.borges.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.borges.eventos.models.Evento;

public interface EventoRepository extends CrudRepository <Evento, String> {
	

}
