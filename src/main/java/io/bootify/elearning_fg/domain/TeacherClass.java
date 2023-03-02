package io.bootify.elearning_fg.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class TeacherClass {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherClassId;

    @Column(nullable = false)
    private Integer teacherId;

    @Column(nullable = false)
    private Integer classId;

    @Column(nullable = false)
    private Integer subjectId;

    @Column(nullable = false, length = 100)
    private String thumbnails;

    @Column(nullable = false, length = 100)
    private String schoolYear;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getTeacherClassId() {
        return teacherClassId;
    }

    public void setTeacherClassId(final Integer teacherClassId) {
        this.teacherClassId = teacherClassId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(final Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(final Integer classId) {
        this.classId = classId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(final Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(final String thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(final String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
