package py.edu.uca.lp3.amarilla.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno extends Persona  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 830444290868549447L;
	
	private String universidad;
	private String facultad;
	private String matricula;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Alumno() {
		super();
	}
	
	
	

	
	
}
