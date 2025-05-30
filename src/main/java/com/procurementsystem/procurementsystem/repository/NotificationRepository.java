package com.procurementsystem.procurementsystem.repository;

import com.procurementsystem.procurementsystem.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
