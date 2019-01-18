package py.edu.uca.lp3.amarilla.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investigador extends Persona{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8746757370634391556L;
	
	private String area;
	
	@ElementCollection
	private List<String> listadeCharlas = new ArrayList<String>();
	@ElementCollection
	private List<String> listadeEventos = new ArrayList<String>();
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	
	public List<String> getListadeCharlas() {
		return listadeCharlas;
	}
	public void setListadeCharlas(List<String> listadeCharlas) {
		this.listadeCharlas = listadeCharlas;
	}
	public List<String> getListadeEventos() {
		return listadeEventos;
	}
	public void setListadeEventos(List<String> listadeEventos) {
		this.listadeEventos = listadeEventos;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Investigador() {
		super();
	}
	
	
	
	
}
