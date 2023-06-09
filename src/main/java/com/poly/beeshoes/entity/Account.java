package com.poly.beeshoes.entity;

import com.poly.beeshoes.entity.base.PrimaryEntity;
import com.poly.beeshoes.infrastructure.constant.EntityProperties;
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

import java.util.Date;

/**
 * @author thangncph26123
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "account") // Tài khoản
public class Account extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_CODE)
    private String code; // Mã khách hàng

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name; // Tên khách hàng

    @Column
    private Date birthDate; // Ngày sinh

    @Column(length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber; // Số điện thoại

    @Column(length = EntityProperties.LENGTH_EMAIL)
    private String email; // Email

    @Column(length = EntityProperties.LENGTH_PASSWORD)
    private String password; // Mật khẩu

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String avatar; // Ảnh đại diện

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role; // Quyền : Admin, Nhân viên, Khách hàng
}
