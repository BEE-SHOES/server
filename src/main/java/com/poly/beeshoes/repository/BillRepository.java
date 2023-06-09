package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(BillRepository.NAME)
public interface BillRepository extends JpaRepository<Bill, String> {

    String NAME = "BaseBillRepository";
}
