package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.StudentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentAssignmentRepository extends JpaRepository<StudentAssignment, Integer> {
}
