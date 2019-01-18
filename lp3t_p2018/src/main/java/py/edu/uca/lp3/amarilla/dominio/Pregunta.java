package py.edu.uca.lp3.amarilla.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pregunta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3296039845922183033L;
	
	private String pregunta;
	private int upVote;
	private int downVote;
	private String fecha;
	private int	identif;
	private int habComentario;
	@ElementCollection
	private List<String> listadeComentarios = new ArrayList<String>();

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public int getUpVote() {
		return upVote;
	}
	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}
	public int getDownVote() {
		return downVote;
	}
	public void setDownVote(int downVote) {
		this.downVote = downVote;
	}
	public List<String> getListadeComentarios() {
		return listadeComentarios;
	}
	public void setListadeComentarios(List<String> listadeComentarios) {
		this.listadeComentarios = listadeComentarios;
	}
	
	
	public int getIdentif() {
		return identif;
	}
	public void setIdentif(int identif) {
		this.identif = identif;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public int getHabComentario() {
		return habComentario;
	}
	public void setHabComentario(int habComentario) {
		this.habComentario = habComentario;
	}
	public Pregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public Pregunta() {
		super();
	}
	

	

	
	

}
