package py.edu.uca.lp3.amarilla.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventoPreinscripcion extends Evento{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5231630269441575449L;
	
	@ElementCollection
	private List<Persona> listadeInscriptos = new ArrayList<Persona>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	
	public List<Persona> getListadeInscriptos() {
		return listadeInscriptos;
	}
	public void setListadeInscriptos(List<Persona> listadeInscriptos) {
		this.listadeInscriptos = listadeInscriptos;
	}
	public EventoPreinscripcion() {
		super();
	}
	

	
	

}
