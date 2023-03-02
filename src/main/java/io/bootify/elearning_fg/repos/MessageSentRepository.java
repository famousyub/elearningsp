package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.MessageSent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageSentRepository extends JpaRepository<MessageSent, Integer> {
}
