package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Integer> {
}
