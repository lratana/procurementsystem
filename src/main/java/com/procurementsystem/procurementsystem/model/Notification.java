package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.NotificationChannel;
import com.procurementsystem.procurementsystem.enumeration.NotificationType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_notification")
public class Notification extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String message;
    private NotificationType notificationType;
    private NotificationChannel notificationChannel;
    private boolean read;
    private Long userId;
    private Long deviceId;
}
