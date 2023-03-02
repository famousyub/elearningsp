package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {
}
