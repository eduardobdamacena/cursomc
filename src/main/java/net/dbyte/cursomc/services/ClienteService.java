package net.dbyte.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dbyte.cursomc.domain.Cliente;
import net.dbyte.cursomc.repositories.ClienteRepository;
import net.dbyte.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id ) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! Id: " +
		id + " , Tipo: " + Cliente.class.getName()));
	}
}
