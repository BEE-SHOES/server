package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(ProductDetailRepository.NAME)
public interface ProductDetailRepository extends JpaRepository<ProductDetail, String> {

    String NAME = "BaseProductDetailRepository";
}
