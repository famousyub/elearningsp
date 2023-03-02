package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserLogRepository extends JpaRepository<UserLog, Integer> {
}
