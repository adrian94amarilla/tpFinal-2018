package py.edu.uca.lp3.amarilla.rest.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Evento;
import py.edu.uca.lp3.amarilla.dominio.EventoCosto;
import py.edu.uca.lp3.amarilla.dominio.EventoPreinscripcion;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.repositorio.CharlaRepositorio;
import py.edu.uca.lp3.amarilla.repositorio.EventoRepositorio;
import py.edu.uca.lp3.amarilla.repositorio.PersonaRepositorio;
import py.edu.uca.lp3.amarilla.repositorio.PreguntaRepositorio;
import py.edu.uca.lp3.amarilla.servicio.ServicioEvento;

@RestController
@RequestMapping("/evento")
public class EventoControlador implements Serializable {

	private static final long serialVersionUID = 2325878358981374044L;


	@Autowired
	private EventoRepositorio eventoRepositorio;
	@Autowired
	private CharlaRepositorio charlaRepositorio;
	@Autowired
	private PersonaRepositorio personaRepositorio;
	@Autowired
	private PreguntaRepositorio preguntaRepositorio;
	
	@Autowired
	private ServicioEvento servicio;
	
/*	@RequestMapping(value = "/nombre", method=RequestMethod.GET)
		public Evento crearEvento(@PathVariable String nombre) {
		
			Evento cris = new Evento();
			cris.setTituloEvento(nombre);
			Charla jose = new Charla();
			jose.setTituloCharla(nombre);
			return vento.agregarCharla(cris, jose);
	}*/
	
	/*@RequestMapping(value= "/listarPrecio/{titulo}", method = RequestMethod.POST)
	public List<String> listaPreciodeCharla(@PathVariable String titulo) {
		Evento aux = eventoRepositorio.findByTituloEvento(titulo).get(0);
		List<EventoCosto> aux2 = aux.getListadeCharlas()
		return null;
	}*/
	
	@RequestMapping(value = "/crearEvento", method = RequestMethod.POST)
		public Evento crearEvento(@RequestBody Evento titulo) {
			return eventoRepositorio.save(titulo);
	}
	
	@RequestMapping(value = "/crearEventoPago", method = RequestMethod.POST)
	public EventoCosto crearEventoPago(@RequestBody EventoCosto titulo) {
		return eventoRepositorio.save(titulo);
	}
	
	@RequestMapping(value = "/crearEventoPreInscripcion", method = RequestMethod.POST)
	public EventoPreinscripcion crearEventoPreInscripcion(@RequestBody EventoPreinscripcion titulo) {
		return eventoRepositorio.save(titulo);
	}
	
	@RequestMapping(value= "/listar/{titulo}", method = RequestMethod.GET)
		public List<Charla> listarCharlas(@PathVariable String titulo) {
		Evento aux = eventoRepositorio.findByTituloEvento(titulo).get(0);
		return aux.getListadeCharlas();
		}
	
	@RequestMapping(value= "/listarHorario/{titulo}", method = RequestMethod.GET)
	public List<String> listarHoradeCharlas(@PathVariable String titulo) {
	Evento aux = eventoRepositorio.findByTituloEvento(titulo).get(0);
	List<Charla> aux2 = aux.getListadeCharlas(); 
	List<String> charlaHoraTitulo = new ArrayList<String>();
	for (Charla aux3 : aux2) {
		charlaHoraTitulo.add(aux3.getHora() + " ---- " + aux3.getTituloCharla());
	}
	return charlaHoraTitulo;
	}
	
	@RequestMapping(value= "/agregarCharla/{evento}/{charla}", method = RequestMethod.POST)
	public Evento agregarCharla(@PathVariable String evento,@PathVariable String charla) {
		Evento eventoAux = eventoRepositorio.findByTituloEvento(evento).get(0);
		Charla charlaAux = charlaRepositorio.findByTituloCharla(charla).get(0);
		List<Charla> listadeCharlas = eventoAux.getListadeCharlas();
		listadeCharlas.add(charlaAux);
		return eventoRepositorio.save(eventoAux);
	}
	
	@RequestMapping(value= "/agregarParticipantePre/{evento}/{cedula}", method = RequestMethod.POST)
	public EventoPreinscripcion agregarParticipantePre(@PathVariable String evento, @PathVariable Integer cedula) {
		EventoPreinscripcion eventoAux = (EventoPreinscripcion) eventoRepositorio.findByTituloEvento(evento).get(0);
		Persona personaAux = personaRepositorio.findByCi(cedula).get(0);
		List<Persona> listadePersonasIns = eventoAux.getListadeInscriptos();
		listadePersonasIns.add(personaAux);
		return eventoRepositorio.save(eventoAux);
	}
	
	@RequestMapping(value= "/agregarParticipantePago/{evento}/{cedula}/{metodo}", method = RequestMethod.POST)
	public EventoCosto agregarParticipantePago(@PathVariable String evento,@PathVariable Integer cedula,@PathVariable String metodo) {
		EventoCosto eventoAux = (EventoCosto) eventoRepositorio.findByTituloEvento(evento).get(0);
		Persona personaAux = personaRepositorio.findByCi(cedula).get(0);
		List<Persona> personaEfectivo = eventoAux.getListadePagoEfectivo();
		List<Persona> personaTarjeta = eventoAux.getListadePagoTarjeta();
		if(metodo.equals("efectivo")) {
			personaEfectivo.add(personaAux);
		}
		else if(metodo.equals("tarjeta")) {
			personaTarjeta.add(personaAux);
		}
		return eventoRepositorio.save(eventoAux);
	}
	
	@RequestMapping(value= "/listarExpositores/{titulo}", method = RequestMethod.GET)
	public List<Persona> listarExpositores(@PathVariable String titulo) {
	Evento eventoAux = eventoRepositorio.findByTituloEvento(titulo).get(0);
	List<Persona> expoEvento = new ArrayList<Persona>();
	List<Charla> charlaAux = eventoAux.getListadeCharlas();
	for(Charla aux3: charlaAux) {
		expoEvento.addAll(aux3.getListadeExpositores());
	}
	return expoEvento;
	}
	
	
	@RequestMapping(value = "/", method=RequestMethod.GET )
	ArrayList<Evento> listarEvento() {
		
		return eventoRepositorio.findAll();	
	}
	
	
}	
