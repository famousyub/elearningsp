package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.SchoolYear;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolYearRepository extends JpaRepository<SchoolYear, Integer> {
}
