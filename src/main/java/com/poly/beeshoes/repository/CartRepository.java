package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(CartRepository.NAME)
public interface CartRepository extends JpaRepository<Cart, String> {

    String NAME = "BaseCartRepository";
}
