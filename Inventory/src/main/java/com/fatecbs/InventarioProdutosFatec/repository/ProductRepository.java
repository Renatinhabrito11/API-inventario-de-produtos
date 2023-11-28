package com.fatecbs.InventarioProdutosFatec.repository;

import java.util.List;

import com.fatecbs.InventarioProdutosFatec.model.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product product);
    void delete(Long id);
    Product update(Long id, Product updatedProduct);
    Product partialUpdate(Long id, Product partialProduct);
}
