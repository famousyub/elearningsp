package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
