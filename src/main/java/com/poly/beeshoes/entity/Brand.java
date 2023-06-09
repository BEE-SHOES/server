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
@Table(name = "brand") // Thương hiệu
public class Brand extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_CODE)
    private String code; // Mã

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name; // Tên
}
