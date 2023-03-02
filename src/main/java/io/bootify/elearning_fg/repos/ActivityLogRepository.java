package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActivityLogRepository extends JpaRepository<ActivityLog, Integer> {
}
