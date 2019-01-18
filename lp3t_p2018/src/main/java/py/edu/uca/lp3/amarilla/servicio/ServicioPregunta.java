package py.edu.uca.lp3.amarilla.servicio;

import java.util.List;

import py.edu.uca.lp3.amarilla.dominio.Pregunta;

public interface ServicioPregunta {
	
	//Esta funcion retorna el numero de votos de las preguntas realizadas
	public Pregunta mostrarVotos (Pregunta pregunta);
	//Esta funcion suma un voto y luego actualiza la cantidad de votos en total positivos asi como tambien el overall (suma de votos positivos menos los negativos)
	public Pregunta votarPositivo (Pregunta pregunta);
	//Esta funcion resta un voto y luego actualiza la cantidad de votos en total negativos asi como tambien el overall (suma de votos positivos menos los negativos)
	public Pregunta votarNegativo (Pregunta pregunta);
	//Esta funcion lista todos los comentarios de las preguntas realizadas si esta funcion esta habilitada por el que la realizo.
	public List<Pregunta> mostrarComentarios (Pregunta pregunta);
	//Esta funcion habilita o deshabilita la posibilidad de realizar comentarios de las preguntas hechas
	public Pregunta habilitarComentario (Pregunta pregunta);
	//Esta funcion permite la eliminacion o no de una pregunta hecha por una persona quienquiera que haya hecho la pregunta o por el mismo expositor de ser necesario
	public Pregunta eliminarPregunta (Pregunta pregunta);
	//Esta funcion crea una pregunta
	public Pregunta crearPregunta (String pregunta);
	
}
