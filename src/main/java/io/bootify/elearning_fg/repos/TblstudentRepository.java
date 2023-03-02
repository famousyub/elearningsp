package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.Tblstudent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TblstudentRepository extends JpaRepository<Tblstudent, Integer> {
}
