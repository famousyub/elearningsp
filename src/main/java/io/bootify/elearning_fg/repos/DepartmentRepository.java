package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
