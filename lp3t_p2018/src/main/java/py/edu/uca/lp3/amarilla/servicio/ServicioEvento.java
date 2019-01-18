package py.edu.uca.lp3.amarilla.servicio;

import java.util.List;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Evento;
import py.edu.uca.lp3.amarilla.dominio.EventoCosto;
import py.edu.uca.lp3.amarilla.dominio.Persona;

public interface ServicioEvento {
	
	
	//Esta funcion agrega una persona a la charla de un Evento Libre
	public Evento inscribirParticipante (Evento evento, Persona persona);
	//Esta funcion agrega una persona a la charla de un Evento de Pago
	public Evento inscribirParticipantePago (Evento evento, Persona persona);
	//Esta funcion agrega una persona a la charla de un Evento de Preinscripcion
	public Evento inscribirParticipantePre (Evento evento, Persona persona);
	
	//Esta funcion lista las charlas que se realizaran en el evento
	public List<Charla> listarCharlas (Evento evento);
	//Esta funcion lista las fechas de las charlas a realizarse
	public List<String> listarHoradeCharlas (Evento evento);
	//Esta funcion lista todos los expositores de las charlas a realizarse
	public List<String> listarExpositores (Evento evento);
	//Esta funcion agrega un evento
	public Evento crearEvento (Evento evento);
	//Esta funcion agrega una charla a un evento
	public Evento agregarCharla (Charla charla, Evento evento);
	//Esta funcion lista las charlas con costo
	public List<String> listarPreciodeCharlas (EventoCosto eventocosto);
	//Esta funcion lista las fromas de pago de las charlas
	public List<String> listarFormasdePago (EventoCosto eventocosto);
	
	//Esta funcion crea un evento de libre acceso
	
	
}
