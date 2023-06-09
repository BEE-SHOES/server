package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(AccountRepository.NAME)
public interface AccountRepository extends JpaRepository<Account, String> {

    String NAME = "BaseAccountRepository";
}
