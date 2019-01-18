package py.edu.uca.lp3.amarilla.repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.amarilla.dominio.Evento;

@RepositoryRestResource(collectionResourceRel = "evento2", path = "evento2")

public interface EventoRepositorio extends PagingAndSortingRepository<Evento, String>{
	
	 ArrayList<Evento> findByTituloEvento(String titulo);
	 ArrayList<Evento> findAll();
}
