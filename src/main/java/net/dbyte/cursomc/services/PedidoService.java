package net.dbyte.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dbyte.cursomc.domain.Pedido;
import net.dbyte.cursomc.repositories.PedidoRepository;
import net.dbyte.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " +
		id + ", Tipo: " + Pedido.class)); 
	}
}
