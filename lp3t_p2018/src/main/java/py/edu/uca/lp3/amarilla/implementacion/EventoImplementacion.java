package py.edu.uca.lp3.amarilla.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Evento;
import py.edu.uca.lp3.amarilla.dominio.EventoCosto;
import py.edu.uca.lp3.amarilla.dominio.Persona;
import py.edu.uca.lp3.amarilla.servicio.ServicioEvento;

@Component
public class EventoImplementacion implements ServicioEvento{

	
	@Override
	public List<Charla> listarCharlas(Evento evento) {
		List<Charla> listaCharlas = evento.getListadeCharlas();
		return listaCharlas;
	}

	@Override
	public List<String> listarHoradeCharlas(Evento evento) {
		List<Charla> listaCharlas = evento.getListadeCharlas();
		List<String> listaHora = new ArrayList<String>();
		for (Charla aux3 : listaCharlas) {
			listaHora.add(aux3.getHora());
		}
		return listaHora;
	}

	@Override
	public List<String> listarExpositores(Evento evento) {
		return null;
	}

	@Override
	public Evento crearEvento(Evento evento) {
		Evento evento1 = new Evento();
		return evento1;
	}

	@Override
	public ArrayList<String> listarPreciodeCharlas(EventoCosto eventocosto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> listarFormasdePago(EventoCosto eventocosto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento agregarCharla(Charla charla, Evento evento) {
		List<Charla> aux = evento.getListadeCharlas();
		aux.add(charla);
		evento.setListadeCharlas(aux);
		return evento;
	}

	@Override
	public Evento inscribirParticipante(Evento evento, Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento inscribirParticipantePago(Evento evento, Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento inscribirParticipantePre(Evento evento, Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}


}
