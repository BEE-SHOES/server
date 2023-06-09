package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.CoverImage;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.constant.StatusImage;
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

/**
 * @author thangncph26123
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "image") // Hình ảnh
public class Image extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_detail_id")
    private ProductDetail productDetail; // Chi tiết sản phẩm

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String url; // Đường dẫn ảnh

    @Column(nullable = false)
    private StatusImage status; // Trạng thái của ảnh: Hoạt động, Ko hoạt động

    @Column(nullable = false)
    private CoverImage cover; // Ảnh tiêu đề | Ảnh thường
}
