package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(RankRepository.NAME)
public interface RankRepository extends JpaRepository<Rank, String> {

    String NAME = "BaseRankRepository";
}
