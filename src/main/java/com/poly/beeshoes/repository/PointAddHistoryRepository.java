package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.PointAddHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(PointAddHistoryRepository.NAME)
public interface PointAddHistoryRepository extends JpaRepository<PointAddHistory, String> {

    String NAME = "BasePointAddHistoryRepository";
}
