package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.model.Convidado;
import com.eventoapp.model.Evento;

public interface ConvidadoRepository extends CrudRepository <Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
}
