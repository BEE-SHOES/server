package com.poly.beeshoes.entity.base;

import com.poly.beeshoes.infrastructure.listener.AuditEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * @author thangncph26123
 */

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditEntity {

    @Column(updatable = false)
    private Long createdAt; // Thời gian tạo

    @Column
    private Long updatedAt; // Thời gian cập nhật gần nhất

    @Column
    private Integer deleted; // Trạng thái xóa

    @Column(updatable = false)
    private String createdBy; // Người tạo

    @Column
    private String updatedBy; // Người cập nhật gần nhất

}
