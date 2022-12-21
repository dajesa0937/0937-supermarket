package com.dajesa.supermarket.persistence;

import com.dajesa.supermarket.domain.Purchase;
import com.dajesa.supermarket.domain.repository.PurchaseRepository;
import com.dajesa.supermarket.persistence.crud.CompraCrudRepository;
import com.dajesa.supermarket.persistence.entity.Compra;
import com.dajesa.supermarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> geALl() {
        return mapper.toPurchase((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByCliente(clientId).map
                (compras -> mapper.toPurchase(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompras(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
