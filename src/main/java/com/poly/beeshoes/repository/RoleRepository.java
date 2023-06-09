package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(RoleRepository.NAME)
public interface RoleRepository extends JpaRepository<Role, String> {

    String NAME = "BaseRoleRepository";
}
