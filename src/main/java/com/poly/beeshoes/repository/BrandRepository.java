package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(BrandRepository.NAME)
public interface BrandRepository extends JpaRepository<Brand, String> {

    String NAME = "BaseBrandRepository";
}
