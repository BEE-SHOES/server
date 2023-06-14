package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
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
@Table(name = "role") // hạng khách hàng
public class Rank extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_NAME)
    private String name;

    @Column
    private Integer requestPoints;

    @Column
    private Short percentReduction;
}
