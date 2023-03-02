package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
}
