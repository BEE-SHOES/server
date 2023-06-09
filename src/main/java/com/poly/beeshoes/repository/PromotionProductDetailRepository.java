package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.PromotionProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(PromotionProductDetailRepository.NAME)
public interface PromotionProductDetailRepository extends JpaRepository<PromotionProductDetail, String> {

    String NAME = "BasePromotionProductDetailRepository";
}
