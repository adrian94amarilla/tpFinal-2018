package py.edu.uca.lp3.amarilla.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.amarilla.dominio.Persona;

@RepositoryRestResource(collectionResourceRel = "persona2", path = "persona2")

public interface PersonaRepositorio extends PagingAndSortingRepository<Persona, Integer> {

	ArrayList<Persona> findByCi(Integer cedula);
	ArrayList<Persona> findAll();
}
