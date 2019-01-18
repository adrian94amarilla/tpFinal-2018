package py.edu.uca.lp3.amarilla.implementacion;

import org.springframework.stereotype.Component;

import py.edu.uca.lp3.amarilla.dominio.Alumno;
import py.edu.uca.lp3.amarilla.servicio.ServicioAlumno;

@Component
public class AlumnoImplementacion implements ServicioAlumno{

	@Override
	public String nombrarUniversidad(Alumno alumno) {
		String aux = alumno.getUniversidad();
		return aux;
	}

	@Override
	public String nombrarFacultad(Alumno alumno) {
		String aux = alumno.getFacultad();
		return aux;
	}

	@Override
	public String nombrarMatricula(Alumno alumno) {
		String aux = alumno.getMatricula();
		return aux;
	}

}
