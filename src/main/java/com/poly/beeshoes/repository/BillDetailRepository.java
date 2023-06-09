package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(BillDetailRepository.NAME)
public interface BillDetailRepository extends JpaRepository<BillDetail, String> {

    String NAME = "BaseBillDetailRepository";
}
