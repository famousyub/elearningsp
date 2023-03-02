package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.StudentBackpack;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentBackpackRepository extends JpaRepository<StudentBackpack, Integer> {
}
