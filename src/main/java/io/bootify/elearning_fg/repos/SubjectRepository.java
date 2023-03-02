package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
