package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.constant.StatusPromition;
import com.poly.beeshoes.infrastructure.constant.TypePromotion;
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
@Table(name = "promotion") // Khuyến mại
public class Promotion extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_CODE)
    private String code; // Mã khuyến mại

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name; // Tên khuyến mại

    @Column(nullable = false)
    private TypePromotion type; // Kiểu khuyến mại: Phần trăm | Số tiền

    @Column(nullable = false)
    private Long startTime; // Thời gian bắt đầu

    @Column(nullable = false)
    private Long endTime; // Thời gian kết thúc

    @Column(nullable = false)
    private Double value; // Giá trị khuyến mại

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String description; // Mô tả khuyến mại

    @Column(nullable = false)
    private StatusPromition status; // Trạng thái khuyến mại: Hoạt động, Ko hoạt động
}
