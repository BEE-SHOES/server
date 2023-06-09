package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(ImageRepository.NAME)
public interface ImageRepository extends JpaRepository<Image, String> {

    String NAME = "BaseImageRepository";
}
