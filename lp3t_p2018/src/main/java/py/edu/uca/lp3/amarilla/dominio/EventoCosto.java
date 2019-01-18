package py.edu.uca.lp3.amarilla.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventoCosto extends Evento{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1787490725330475030L;
	
	private int costo;
	@ElementCollection
	private List<Persona> listadePagoEfectivo = new ArrayList<Persona>();
	@ElementCollection
	private List<Persona> listadePagoTarjeta = new ArrayList<Persona>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public List<Persona> getListadePagoEfectivo() {
		return listadePagoEfectivo;
	}
	public void setListadePagoEfectivo(List<Persona> listadePagoEfectivo) {
		this.listadePagoEfectivo = listadePagoEfectivo;
	}
	public List<Persona> getListadePagoTarjeta() {
		return listadePagoTarjeta;
	}
	public void setListadePagoTarjeta(List<Persona> listadePagoTarjeta) {
		this.listadePagoTarjeta = listadePagoTarjeta;
	}
	public EventoCosto() {
		super();
	}
	


}
