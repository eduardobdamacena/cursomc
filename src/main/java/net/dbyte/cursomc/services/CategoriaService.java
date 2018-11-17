package net.dbyte.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dbyte.cursomc.domain.Categoria;
import net.dbyte.cursomc.repositories.CategoriaRepository;
import net.dbyte.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id ) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! Id: " +
		id + " , Tipo: " + Categoria.class.getName()));
	}
}
