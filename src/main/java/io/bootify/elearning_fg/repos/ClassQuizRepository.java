package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.ClassQuiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClassQuizRepository extends JpaRepository<ClassQuiz, Integer> {
}
