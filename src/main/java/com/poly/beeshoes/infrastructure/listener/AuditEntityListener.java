package com.poly.beeshoes.infrastructure.listener;

import com.poly.beeshoes.entity.base.AuditEntity;
import com.poly.beeshoes.infrastructure.constant.Constants;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Calendar;

/**
 * @author thangncph26123
 */
public class AuditEntityListener {

    @PrePersist
    private void onCreate(AuditEntity entity) {
        String id = Constants.ID_USER;
        entity.setCreatedAt(getCurrentTime());
        entity.setUpdatedAt(getCurrentTime());
        entity.setDeleted(0);
        entity.setCreatedBy(id);
        entity.setUpdatedBy(id);
    }

    @PreUpdate
    private void onUpdate(AuditEntity entity) {
        entity.setUpdatedAt(getCurrentTime());
    }

    private long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
