package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(MaterialRepository.NAME)
public interface MaterialRepository extends JpaRepository<Material, String> {

    String NAME = "BaseMaterialRepository";
}
