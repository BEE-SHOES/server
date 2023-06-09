package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.constant.StatusProduct;
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
@Table(name = "product_detail") // Chi tiết sản phẩm
public class ProductDetail extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product; // Sản phẩm

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category; // Thể loại

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand; // Thương hiệu

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id")
    private Material material; // Chất liệu

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sole_height_id")
    private SoleHeight soleHeight; // Độ cao đế

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id")
    private Color color; // Màu sắc

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "size_id")
    private Size size; // Kích thước

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shoes_collar_id")
    private ShoesCollar shoesCollar; // Cổ giày

    @Column(length = EntityProperties.LENGTH_NAME)
    private String sku; // Mã vạch

    @Column
    private Integer quantity; // Số lượng

    @Column
    private BigDecimal price; // Giá

    @Column
    private BigDecimal promotionalPrice; // Giá khuyến mại

    @Column(nullable = false)
    private StatusProduct status; // Trạng thái hoạt động của sản phẩm: Hoạt động, Ko hoạt động
}
