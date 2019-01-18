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
import py.edu.uca.lp3.amarilla.dominio.Invitado;
import py.edu.uca.lp3.amarilla.dominio.Profesional;
import py.edu.uca.lp3.amarilla.dominio.Profesor;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.repositorio.PersonaRepositorio;

@RestController
@RequestMapping("/persona")
public class PersonaControlador {

	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	@RequestMapping(value = "/agregarPersona", method = RequestMethod.POST)
	public Persona agregarPersona(@RequestBody Persona persona) {
		Persona aux = persona;
		return personaRepositorio.save(aux);
	}

	@RequestMapping(value = "/agregarAlumno", method = RequestMethod.POST)
	public Persona agregarAlumno(@RequestBody Alumno persona) {
		Alumno aux = persona;
		return personaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/agregarInvestigador", method = RequestMethod.POST)
	public Persona agregarInvestigador(@RequestBody Investigador persona) {
		Investigador aux = persona;
		return personaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/agregarProfesional", method = RequestMethod.POST)
	public Persona agregarProfesional(@RequestBody Profesional persona) {
		Profesional aux = persona;
		return personaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/agregarInvitado", method = RequestMethod.POST)
	public Persona agregarInvitado(@RequestBody Invitado persona) {
		Invitado aux = persona;
		return personaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/agregarProfesor", method = RequestMethod.POST)
	public Persona agregarProfesor(@RequestBody Profesor persona) {
		Profesor aux = persona;
		return personaRepositorio.save(aux);
	}
	
	@RequestMapping(value = "/detalleInvestigador/{cedula}", method = RequestMethod.GET)
	public Investigador detalleInvestigador(@PathVariable Integer cedula) {
		return (Investigador) personaRepositorio.findByCi(cedula).get(0);
	}
	
	@RequestMapping(value = "/detalleAlumno/{cedula}", method = RequestMethod.GET)
	public Alumno detalleAlumno(@PathVariable Integer cedula) {
		return (Alumno) personaRepositorio.findByCi(cedula).get(0);
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET )
	ArrayList<Persona> listarPersonas() {
		
		return personaRepositorio.findAll();	
	}
	
}
	