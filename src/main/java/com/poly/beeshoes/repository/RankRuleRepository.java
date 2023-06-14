package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.RankRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(RankRuleRepository.NAME)
public interface RankRuleRepository extends JpaRepository<RankRule, String> {

    String NAME = "BaseRankRuleRepository";
}
