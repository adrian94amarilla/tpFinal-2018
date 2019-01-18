package py.edu.uca.lp3.amarilla.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7948083021577711058L;
	
	private String nombre;
	private String apellido;
	private Integer ci;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getCi() {
		return ci;
	}
	public void setCi(Integer ci) {
		this.ci = ci;
	}
	public Persona() {
		super();
	}
}
