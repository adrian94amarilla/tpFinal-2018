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
public class Charla implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7990788406474357450L;
	
	private String tituloCharla;
	private String hora;
	@ElementCollection
	private List<Pregunta> listadePreguntas = new ArrayList<Pregunta>();
	@ElementCollection
	private List<Persona> listadeExpositores = new ArrayList<Persona>();
	@ElementCollection
	private List<Persona> listadeParticipantes = new ArrayList<Persona>();
	@ElementCollection
	private List<Persona> listadeOrganizadores = new ArrayList<Persona>();
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	public String getTituloCharla() {
		return tituloCharla;
	}
	public void setTituloCharla(String tituloCharla) {
		this.tituloCharla = tituloCharla;
	}
	public List<Persona> getListadeExpositores() {
		return listadeExpositores;
	}
	public void setListadeExpositores(List<Persona> listadeExpositores) {
		this.listadeExpositores = listadeExpositores;
	}
	public String getHora() {
		return hora;
	}
	
	public List<Pregunta> getListadePreguntas() {
		return listadePreguntas;
	}
	public void setListadePreguntas(List<Pregunta> listadePreguntas) {
		this.listadePreguntas = listadePreguntas;
	}
	public List<Persona> getListadeParticipantes() {
		return listadeParticipantes;
	}
	public void setListadeParticipantes(List<Persona> listadeParticipantes) {
		this.listadeParticipantes = listadeParticipantes;
	}
	public List<Persona> getListadeOrganizadores() {
		return listadeOrganizadores;
	}
	public void setListadeOrganizadores(List<Persona> listadeOrganizadores) {
		this.listadeOrganizadores = listadeOrganizadores;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Charla(String nombre, String hora) {
		this.tituloCharla = nombre;
		this.hora = hora;
	}
	public Charla() {
		super();
	}
	
	

	

}
