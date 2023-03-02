package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
