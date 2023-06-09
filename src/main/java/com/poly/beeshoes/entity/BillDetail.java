package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.StatusBillDetail;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author thangncph26123
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "bill_detail") // Hóa đơn chi tiết
public class BillDetail extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_detail_id")
    private ProductDetail productDetail; // Chi tiết sản phẩm

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id")
    private Bill bill; // Hóa đơn

    @Column
    private Integer quantity; // Số lượng mua

    @Column
    private BigDecimal price; // Giá bán

    @Column
    private BigDecimal promotionalPrice; // Giá khuyến mại

    @Column(nullable = false)
    private StatusBillDetail status; // Trạng thái hóa đơn chi tiết: Đã bán, Đã trả
}
