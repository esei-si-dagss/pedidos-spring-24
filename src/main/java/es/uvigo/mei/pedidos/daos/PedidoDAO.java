package es.uvigo.mei.pedidos.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.uvigo.mei.pedidos.entidades.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Long>{

	@Query("SELECT DISTINCT p FROM Pedido AS p JOIN FETCH p.lineas WHERE p.id = :id")
	public Pedido findPedidoConLineas(@Param("id") Long id);

	public List<Pedido> findByClienteDNI(String dni);
}
