package es.uvigo.mei.pedidos.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.uvigo.mei.pedidos.entidades.Articulo;

public interface ArticuloDAO extends JpaRepository<Articulo, Long>{
	public List<Articulo> findByFamiliaId(Long id);
	public List<Articulo> findByNombre(String nombre);
    
	@Query("SELECT a FROM Articulo a WHERE a.descripcion LIKE %?1%")
	public List<Articulo> findByPatronDescripcion(String patron);
	// Podria haberse usado findByDescripcionContaining()
}
