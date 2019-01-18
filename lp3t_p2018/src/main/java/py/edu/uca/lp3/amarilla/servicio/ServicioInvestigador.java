package py.edu.uca.lp3.amarilla.servicio;

import java.util.List;

import py.edu.uca.lp3.amarilla.dominio.Evento;
import py.edu.uca.lp3.amarilla.dominio.Investigador;

public interface ServicioInvestigador {
	
	//Esta funcion lista todos los eventos en el que el investigador participo como orador
	public List<Evento> listarEventosOrador (Investigador investigador);
	//Esta funcion lista todos los eventos en el que el investigador participo como expositor
	public List<Evento> listarEventosExpositor (Investigador investigador);
	
}
