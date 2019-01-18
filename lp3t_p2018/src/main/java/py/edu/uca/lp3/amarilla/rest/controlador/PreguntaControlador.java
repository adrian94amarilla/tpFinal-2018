package py.edu.uca.lp3.amarilla.rest.controlador;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.amarilla.dominio.Alumno;
import py.edu.uca.lp3.amarilla.dominio.Investigador;
import py.edu.uca.lp3.amarilla.dominio.Profesional;
import py.edu.uca.lp3.amarilla.dominio.Profesor;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.dominio.Pregunta;
import py.edu.uca.lp3.amarilla.repositorio.PersonaRepositorio;
import py.edu.uca.lp3.amarilla.repositorio.PreguntaRepositorio;
import py.edu.uca.lp3.amarilla.servicio.ServicioEvento;
import py.edu.uca.lp3.amarilla.servicio.ServicioPregunta;

@RestController
@RequestMapping("/pregunta")
public class PreguntaControlador {

	@Autowired
	private PreguntaRepositorio preguntaRepositorio;
	
	@Autowired
	private ServicioPregunta servicioPregunta;
	
	
	@RequestMapping(value= "/crearPregunta", method = RequestMethod.POST)
	public Pregunta crearPregunta(@RequestBody String preguntame) {
		Pregunta aux = servicioPregunta.crearPregunta(preguntame);
		return preguntaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET )
	ArrayList<Pregunta> listarPreguntas() {
		return preguntaRepositorio.findAll();	
	}
}
