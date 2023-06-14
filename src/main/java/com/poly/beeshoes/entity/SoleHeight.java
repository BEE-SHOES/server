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
import org.hibernate.annotations.Nationalized;

/**
 * @author thangncph26123
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "sole_height") // Độ cao của đế giày
public class SoleHeight extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_CODE, unique = true)
    private String code;

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name;
}
