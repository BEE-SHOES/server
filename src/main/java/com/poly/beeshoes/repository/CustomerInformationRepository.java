package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.CustomerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(CustomerInformationRepository.NAME)
public interface CustomerInformationRepository extends JpaRepository<CustomerInformation, String> {

    String NAME = "BaseCustomerInformationRepository";
}
