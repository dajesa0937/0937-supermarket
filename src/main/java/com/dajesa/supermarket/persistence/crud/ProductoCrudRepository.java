package com.dajesa.supermarket.persistence.crud;

import com.dajesa.supermarket.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
   // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

   // @Override
    // Optional<Producto> findById(Integer integer)

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
