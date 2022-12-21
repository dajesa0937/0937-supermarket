package com.dajesa.supermarket.persistence.crud;

import com.dajesa.supermarket.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByCliente(String idCliente);
}
