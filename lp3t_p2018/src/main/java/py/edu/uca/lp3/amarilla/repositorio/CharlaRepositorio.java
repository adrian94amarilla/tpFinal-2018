package py.edu.uca.lp3.amarilla.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.amarilla.dominio.Charla;

@RepositoryRestResource(collectionResourceRel = "charla2", path = "charla2")

public interface CharlaRepositorio extends PagingAndSortingRepository<Charla, String>{
	
	 ArrayList<Charla> findByTituloCharla(String titulo);
	 ArrayList<Charla> findAll();
}