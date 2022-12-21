package com.dajesa.supermarket.domain.repository;

import com.dajesa.supermarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> geALl();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
