package py.edu.uca.lp3.amarilla.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.amarilla.dominio.Pregunta;

@RepositoryRestResource(collectionResourceRel = "pregunta2", path = "pregunta2")

public interface PreguntaRepositorio extends PagingAndSortingRepository<Pregunta, Integer> {

	ArrayList<Pregunta> findById(Integer identi);
	ArrayList<Pregunta> findAll();
}
