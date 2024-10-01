package es.uvigo.mei.pedidos.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uvigo.mei.pedidos.entidades.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, String>{
	List<Cliente> findByNombreContaining(String nombre);
	List<Cliente> findByDireccionLocalidad(String localidad);
}
