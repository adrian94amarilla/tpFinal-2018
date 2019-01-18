package py.edu.uca.lp3.amarilla.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5312308409967400973L;
	
	private String tituloEvento;
	private String fecha;
	@ElementCollection
	private List<Persona> listadeParticipantes = new ArrayList<Persona>();
	@ElementCollection
	private List<Charla> listadeCharlas = new ArrayList<Charla>();
	@ElementCollection
	private List<Persona> listadeOrganizadores = new ArrayList<Persona>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	
	public String getTituloEvento() {
		return tituloEvento;
	}
	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public List<Persona> getListadeParticipantes() {
		return listadeParticipantes;
	}
	public void setListadeParticipantes(List<Persona> listadeParticipantes) {
		this.listadeParticipantes = listadeParticipantes;
	}
	public List<Charla> getListadeCharlas() {
		return listadeCharlas;
	}
	public void setListadeCharlas(List<Charla> listadeCharlas) {
		this.listadeCharlas = listadeCharlas;
	}
	
	public List<Persona> getListadeOrganizadores() {
		return listadeOrganizadores;
	}
	public void setListadeOrganizadores(List<Persona> listadeOrganizadores) {
		this.listadeOrganizadores = listadeOrganizadores;
	}
	public Evento() {
		super();
	}
	
	

	
}
