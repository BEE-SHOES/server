package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(BillHistoryRepository.NAME)
public interface BillHistoryRepository extends JpaRepository<BillHistory, String> {

    String NAME = "BaseBillHistoryRepository";
}
