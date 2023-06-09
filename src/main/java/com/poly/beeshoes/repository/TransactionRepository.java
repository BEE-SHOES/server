package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(TransactionRepository.NAME)
public interface TransactionRepository extends JpaRepository<Transaction, String> {

    String NAME = "BaseTransactionRepository";
}
