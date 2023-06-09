package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(ProductRepository.NAME)
public interface ProductRepository extends JpaRepository<Product, String> {

    String NAME = "BaseProductRepository";
}
