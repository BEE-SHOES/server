package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(CartDetailRepository.NAME)
public interface CartDetailRepository extends JpaRepository<CartDetail, String> {

    String NAME = "BaseCartDetailRepository";
}
