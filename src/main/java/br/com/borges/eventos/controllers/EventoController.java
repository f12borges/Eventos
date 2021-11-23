package br.com.borges.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.borges.eventos.models.Evento;
import br.com.borges.eventos.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository er;

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String form(Evento evento) {

		er.save(evento);

		return "evento/formEvento";
	}

	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {

		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos",eventos);
		return mv;

	}

}
