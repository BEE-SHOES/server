package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.ShoesCollar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(ShoesCollarRepository.NAME)
public interface ShoesCollarRepository extends JpaRepository<ShoesCollar, String> {

    String NAME = "BaseShoesCollarRepository";
}
