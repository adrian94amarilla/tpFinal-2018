package py.edu.uca.lp3.amarilla.implementacion;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import py.edu.uca.lp3.amarilla.dominio.Evento;
import py.edu.uca.lp3.amarilla.dominio.Investigador;
import py.edu.uca.lp3.amarilla.servicio.ServicioInvestigador;

@Component
public class InvestigadorImplementacion implements ServicioInvestigador{

	@Override
	public ArrayList<Evento> listarEventosOrador(Investigador investigador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Evento> listarEventosExpositor(Investigador investigador) {
		// TODO Auto-generated method stub
		return null;
	}

}
