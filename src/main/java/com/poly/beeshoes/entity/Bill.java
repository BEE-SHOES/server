package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
import com.poly.beeshoes.infrastructure.constant.PaymentStatus;
import com.poly.beeshoes.infrastructure.constant.StatusBill;
import com.poly.beeshoes.infrastructure.constant.TypeBill;
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
@Table(name = "bill") // Hóa đơn
public class Bill extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Account customer; // Khách hàng

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Account employee; // Nhân viên

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_information_id")
    private CustomerInformation customerInformation; // Thông tin địa chỉ khách hàng

    @Column(length = EntityProperties.LENGTH_CODE, unique = true)
    private String code; // Mã hóa đơn

    @Column
    private Long confirmationDate; // Ngày xác nhận

    @Column
    private Long paymentDate; // Ngày thanh toán

    @Column
    private Long deliveryDate; // Ngày giao hàng

    @Column
    private Long receivedDate; // Ngày nhận

    @Column
    private Long completionDate; // Ngày hoàn thành

    @Column
    private Long desiredDate; // Ngày mong muốn

    @Column(nullable = false)
    private TypeBill type; // Loại hóa đơn : Online | Đặt hàng | Tại quầy

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String customerName; // Tên người nhận

    @Column(length = EntityProperties.LENGTH_ADDRESS)
    @Nationalized
    private String address; // Địa chỉ người nhận

    @Column(length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber; // Số điện thoại người nhận

    @Column
    private BigDecimal moneyShip; // Tiền ship

    @Column
    private BigDecimal totalMoney; // Tổng tiền

    @Column
    private PaymentStatus paymentStatus; // Trạng thái thanh toán: Thanh toán trước | Thanh toán khi nhận hàng

    @Column
    private StatusBill status; // Trạng thái của hóa đơn
}
