package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(ColorRepository.NAME)
public interface ColorRepository extends JpaRepository<Color, String> {

    String NAME = "BaseColorRepository";
}
