package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(PromotionRepository.NAME)
public interface PromotionRepository extends JpaRepository<Promotion, String> {

    String NAME = "BasePromotionRepository";
}
