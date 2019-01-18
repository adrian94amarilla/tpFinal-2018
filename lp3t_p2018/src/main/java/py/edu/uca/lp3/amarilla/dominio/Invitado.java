package py.edu.uca.lp3.amarilla.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invitado extends Profesional{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1463548867424194941L;
	
	private String origen;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Invitado() {
		super();
	}

	

}
