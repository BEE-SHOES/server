package com.poly.beeshoes.entity.base;

import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.listener.CreatePrimaryEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * @author thangncph26123
 */

@Getter
@Setter
@MappedSuperclass
@EntityListeners(CreatePrimaryEntityListener.class)
public abstract class PrimaryEntity extends AuditEntity
    implements IsIdentified {

    @Id
    @Column(length = EntityProperties.LENGTH_ID, updatable = false)
    private String id;

}
