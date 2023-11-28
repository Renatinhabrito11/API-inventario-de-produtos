package com.fatecbs.InventarioProdutosFatec.service;

import java.util.List;

import com.fatecbs.InventarioProdutosFatec.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    void deleteProduct(Long id);
    Product updateProduct(Long id, Product updatedProduct);
    Product partialUpdateProduct(Long id, Product partialProduct);
}
