package br.com.borges.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.borges.eventos.models.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

}
