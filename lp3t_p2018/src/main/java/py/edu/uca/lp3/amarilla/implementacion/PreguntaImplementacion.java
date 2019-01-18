package py.edu.uca.lp3.amarilla.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import py.edu.uca.lp3.amarilla.dominio.Charla;
import py.edu.uca.lp3.amarilla.dominio.Pregunta;
import py.edu.uca.lp3.amarilla.servicio.ServicioPregunta;

@Component
public class PreguntaImplementacion implements ServicioPregunta {

	@Override
	public Pregunta mostrarVotos(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta votarPositivo(Pregunta pregunta) {
		Integer aux = pregunta.getUpVote();
		aux = aux + 1;
		pregunta.setUpVote(aux);
		return pregunta;
	}

	@Override
	public Pregunta votarNegativo(Pregunta pregunta) {
		Integer aux = pregunta.getDownVote();
		aux = aux + 1;
		pregunta.setDownVote(aux);
		return pregunta;
	}

	@Override
	public ArrayList<Pregunta> mostrarComentarios(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta habilitarComentario(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta eliminarPregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta crearPregunta(String pregunta) {
		Pregunta preguntaAux = new Pregunta(pregunta);
		return preguntaAux;
	}

	@Override
	public List<Pregunta> listarPregunta(Charla charla) {
		return charla.getListadePreguntas();
	}

	

}
