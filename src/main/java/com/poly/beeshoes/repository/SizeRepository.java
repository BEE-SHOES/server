package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(SizeRepository.NAME)
public interface SizeRepository extends JpaRepository<Size, String> {

    String NAME = "BaseSizeRepository";
}
