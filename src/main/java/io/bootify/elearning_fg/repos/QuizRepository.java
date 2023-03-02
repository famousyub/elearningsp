package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
