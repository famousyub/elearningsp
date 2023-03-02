package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
