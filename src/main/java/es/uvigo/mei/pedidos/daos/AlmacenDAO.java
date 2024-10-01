package es.uvigo.mei.pedidos.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.uvigo.mei.pedidos.entidades.Almacen;

public interface AlmacenDAO extends JpaRepository<Almacen, Long>{
	List<Almacen> findByNombreContaining(String nombre);
	List<Almacen> findByDireccionLocalidad(String localidad);

	@Query("SELECT aa.almacen FROM ArticuloAlmacen AS aa WHERE aa.articulo.id = :articuloId")
	List<Almacen> findByArticuloId(@Param("articuloId") Long articuloId);
}
