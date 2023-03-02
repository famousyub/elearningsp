package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.TeacherNotification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherNotificationRepository extends JpaRepository<TeacherNotification, Integer> {
}
