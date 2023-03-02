package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Files;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilesRepository extends JpaRepository<Files, Integer> {
}
