package com.poly.beeshoes.repository;

import com.poly.beeshoes.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author thangncph26123
 */
@Repository(NotificationRepository.NAME)
public interface NotificationRepository extends JpaRepository<Notification, String> {

    String NAME = "BaseNotificationRepository";
}
