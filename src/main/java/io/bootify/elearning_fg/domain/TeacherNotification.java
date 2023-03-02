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
public class TeacherNotification {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherNotificationId;

    @Column(nullable = false)
    private Integer teacherClassId;

    @Column(nullable = false, length = 100)
    private String notification;

    @Column(nullable = false, length = 100)
    private String dateOfNotification;

    @Column(nullable = false, length = 100)
    private String link;

    @Column(nullable = false)
    private Integer studentId;

    @Column(nullable = false)
    private Integer assignmentId;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getTeacherNotificationId() {
        return teacherNotificationId;
    }

    public void setTeacherNotificationId(final Integer teacherNotificationId) {
        this.teacherNotificationId = teacherNotificationId;
    }

    public Integer getTeacherClassId() {
        return teacherClassId;
    }

    public void setTeacherClassId(final Integer teacherClassId) {
        this.teacherClassId = teacherClassId;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(final String notification) {
        this.notification = notification;
    }

    public String getDateOfNotification() {
        return dateOfNotification;
    }

    public void setDateOfNotification(final String dateOfNotification) {
        this.dateOfNotification = dateOfNotification;
    }

    public String getLink() {
        return link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(final Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(final Integer assignmentId) {
        this.assignmentId = assignmentId;
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
