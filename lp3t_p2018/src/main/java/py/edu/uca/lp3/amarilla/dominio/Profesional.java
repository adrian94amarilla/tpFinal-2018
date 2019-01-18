package py.edu.uca.lp3.amarilla.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesional extends Persona {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1819962453317049061L;
	
	private String titulo;
	private String area;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Profesional() {
		super();
	}
	
	
}
