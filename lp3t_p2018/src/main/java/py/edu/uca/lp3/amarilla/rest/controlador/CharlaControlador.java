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
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.repositorio.CharlaRepositorio;
import py.edu.uca.lp3.amarilla.repositorio.PersonaRepositorio;
import py.edu.uca.lp3.amarilla.servicio.ServicioCharla;

@RestController
@RequestMapping("/charla")
public class CharlaControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 957648187400405143L;


	@Autowired
	private CharlaRepositorio charlaRepositorio;
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	@Autowired
	private ServicioCharla servicio;
	
	@RequestMapping(value= "/crearCharla/{titulo}/{hora}", method = RequestMethod.POST)
	public Charla crearCharla(@PathVariable String titulo,@PathVariable String hora) {
		Charla aux = servicio.crearCharla(titulo, hora);
		return charlaRepositorio.save(aux);
	}
	
	@RequestMapping(value= "/agregarExpositor/{charla}/{cedula}", method = RequestMethod.POST)
	public Charla agregarExpositor(@PathVariable String charla, @PathVariable Integer cedula) {
		Charla charlaAux = charlaRepositorio.findByTituloCharla(charla).get(0);
		List<Persona> listadeExpositores = charlaAux.getListadeExpositores();
		listadeExpositores.add(personaRepositorio.findByCi(cedula).get(0));
		return charlaRepositorio.save(charlaAux);
	}
	
	@RequestMapping(value= "/listarExpositores/{titulo}", method = RequestMethod.GET)
	public List<Persona> listarExpositores(@PathVariable String titulo) {
	Charla aux = charlaRepositorio.findByTituloCharla(titulo).get(0);
	return aux.getListadeExpositores();
	}
	
	@RequestMapping(value= "/inscribirParticipante/{charla}/{cedula}", method = RequestMethod.POST)
	public Charla inscribirParticipante(@PathVariable String charla, @PathVariable Integer cedula) {
		Charla charlaAux = charlaRepositorio.findByTituloCharla(charla).get(0);
		List<Persona> listadeParticipantes = charlaAux.getListadeParticipantes();
		listadeParticipantes.add(personaRepositorio.findByCi(cedula).get(0));
		return charlaRepositorio.save(charlaAux);
	}
	
	@RequestMapping(value= "/tipoExpositor/{charla}", method = RequestMethod.GET)
	public List<String> tipoExpositor(@PathVariable String charla) {
		return servicio.tipoExpositor(charlaRepositorio.findByTituloCharla(charla).get(0));
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET )
	ArrayList<Charla> listarCharla() {
		
		return charlaRepositorio.findAll();	
	}
	
}
