package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContentRepository extends JpaRepository<Content, Integer> {
}
