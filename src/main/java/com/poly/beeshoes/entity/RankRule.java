package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.StatusRankRule;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author thangncph26123
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "rank_rule") // Quy định của rank
public class RankRule extends PrimaryEntity {

    @Column
    private Float pointAccumulationRate; // Tỉ lệ quy đổi điểm

    @Column
    private Long resetTime; // Thời gian reset điểm của người dùng

    @Column(nullable = false)
    private StatusRankRule status; // Trạng thái của quy định
}
