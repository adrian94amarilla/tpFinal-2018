package py.edu.uca.lp3.amarilla.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.dominio.Pregunta;
import py.edu.uca.lp3.amarilla.servicio.ServicioCharla;

@Component
public class CharlaImplementacion implements ServicioCharla {

	@Override
	public Charla inscribirParticipante(Charla charla, Persona persona) {
		List<Persona> aux = charla.getListadeParticipantes();
		aux.add(persona);
		charla.setListadeParticipantes(aux);
		return charla;
	}
	@Override
	public Charla agregarExpositor(Charla charla, Persona persona) {
		List<Persona> aux = charla.getListadeExpositores();
		aux.add(persona);
		charla.setListadeExpositores(aux);
		return charla;
	}

	@Override
	public Charla agregarPregunta(Charla charla, Pregunta pregunta) {
		List<Pregunta> aux = charla.getListadePreguntas();
		aux.add(pregunta);
		charla.setListadePreguntas(aux);
		return charla;
	}

	@Override
	public List<Pregunta> listarPreguntas(Charla charla) {
		List<Pregunta> aux = charla.getListadePreguntas();
		return aux;
	}

	@Override
	public List<Persona> listarExpositor(Charla charla) {
		List<Persona> aux = charla.getListadeExpositores();
		return aux;
	}

	@Override
	public Charla crearCharla(String nombre, String hora) {
		Charla charla = new Charla(nombre, hora);
		return charla;
	}

	@Override
	public List<String> tipoExpositor(Charla charla) {
		List<Persona> expoAux = charla.getListadeExpositores();
		List<String> tipoExpo = new ArrayList<String>();
		for(Persona aux3 : expoAux) {
			if(aux3.getClass().getSimpleName().equals("Persona")) {
				tipoExpo.add("Nombre: "+aux3.getNombre()+" "+"Apellido: "+aux3.getApellido()+" "+"Ocupacion: "+"Sin Ocupacion");
			}
			else{
				tipoExpo.add("Nombre: "+aux3.getNombre()+" "+"Apellido: "+aux3.getApellido()+" "+"Ocupacion: "+aux3.getClass().getSimpleName());
			}
		}
		return tipoExpo;
	}

	@Override
	public Charla inscribirParticipantePago(Charla charla, Persona persona) {
		List<Persona> aux = charla.getListadeParticipantes();
		aux.add(persona);
		charla.setListadeParticipantes(aux);
		return charla;
	}

	@Override
	public Charla inscribirParticipantePre(Charla charla, Persona persona) {
		List<Persona> aux = charla.getListadeParticipantes();
		aux.add(persona);
		charla.setListadeParticipantes(aux);
		return charla;
	}

	
}
