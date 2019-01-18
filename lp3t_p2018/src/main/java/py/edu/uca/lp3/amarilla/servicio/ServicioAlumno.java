package py.edu.uca.lp3.amarilla.servicio;

import py.edu.uca.lp3.amarilla.dominio.Alumno;

public interface ServicioAlumno {
	
	//Esta funcion nombra la Universidad de un alumno
	public String nombrarUniversidad(Alumno alumno);
	//Esta funcion nombra la Facultad de un alumno
	public String nombrarFacultad(Alumno alumno);
	//Esta funcion nombra la matricula de un alumno
	public String nombrarMatricula(Alumno alumno);
	
	

}
