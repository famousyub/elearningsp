package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.TeacherClassStudent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherClassStudentRepository extends JpaRepository<TeacherClassStudent, Integer> {
}
