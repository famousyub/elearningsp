package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Integer> {
}
