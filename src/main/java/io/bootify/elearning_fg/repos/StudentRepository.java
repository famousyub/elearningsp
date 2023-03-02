package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
