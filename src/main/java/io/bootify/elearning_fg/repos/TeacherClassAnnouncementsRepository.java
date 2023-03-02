package io.bootify.elearning_fg.repos;

import io.bootify.elearning_fg.domain.TeacherClassAnnouncements;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherClassAnnouncementsRepository extends JpaRepository<TeacherClassAnnouncements, Integer> {
}
