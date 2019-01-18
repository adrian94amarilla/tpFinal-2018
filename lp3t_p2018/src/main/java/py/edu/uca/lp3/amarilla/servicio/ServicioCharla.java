package py.edu.uca.lp3.amarilla.servicio;

import java.util.List;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.dominio.Pregunta;

public interface ServicioCharla {
	
	//Esta funcion agrega una persona a la charla de un Evento Libre
	public Charla inscribirParticipante (Charla charla, Persona persona);
	//Esta funcion agrega una persona a la charla de un Evento de Pago
	public Charla inscribirParticipantePago (Charla charla, Persona persona);
	//Esta funcion agrega una persona a la charla de un Evento de Preinscripcion
	public Charla inscribirParticipantePre (Charla charla, Persona persona);
	//Esta funcion agrega un expositor a la charla
	public Charla agregarExpositor (Charla charla, Persona persona);
	//Esta funcion agrega una pregunta a la charla
	public Charla agregarPregunta (Charla charla, Pregunta pregunta);
	//Esta funcion agrega una charla a un evento
	public Charla crearCharla(String nombre, String hora);
	//Esta funcion lista las preguntas de la charla
	public List<Pregunta> listarPreguntas (Charla charla);
	//Esta funcion lista los expositores de la charla
	public List<Persona> listarExpositor (Charla charla);
	//Esta funcion retorta el tipo de Ocupacion de la Persona
	public List<String> tipoExpositor (Charla charla);
	
}
