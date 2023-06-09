package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.SoleHeight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(SoleHeightRepository.NAME)
public interface SoleHeightRepository extends JpaRepository<SoleHeight, String> {

    String NAME = "BaseSoleHeightRepository";
}
