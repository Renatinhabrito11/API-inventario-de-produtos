package com.fatecbs.InventarioProdutosFatec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecbs.InventarioProdutosFatec.model.Product;
import com.fatecbs.InventarioProdutosFatec.repository.ProductRepository;
import com.fatecbs.InventarioProdutosFatec.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product updateProduct(Long id, Product updatedProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product partialUpdateProduct(Long id, Product partialProduct) {
		// TODO Auto-generated method stub
		return null;
	}
}