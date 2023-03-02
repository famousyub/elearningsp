package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepository extends JpaRepository<Message, Integer> {
}
