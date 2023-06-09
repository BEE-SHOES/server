package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.constant.TypeTransaction;
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
import org.hibernate.annotations.Nationalized;

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
@Table(name = "transaction") // Lịch sử giao dịch
public class Transaction extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id")
    private Bill bill; // Hóa đơn

    @Column(nullable = false)
    private TypeTransaction type; // Loại giao dịch: Tiền mặt | Chuyển khoản

    @Column
    private BigDecimal totalMoney; // Tổng tiền giao dịch

    @Column(length = EntityProperties.LENGTH_CODE)
    private String tradingCode; // Mã giao dịch

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String note; // Ghi chú
}
