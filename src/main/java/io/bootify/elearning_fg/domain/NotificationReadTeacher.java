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
public class NotificationReadTeacher {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notificationReadTeacherId;

    @Column(nullable = false)
    private Integer teacherId;

    @Column(nullable = false, length = 100)
    private String studentRead;

    @Column(nullable = false)
    private Integer notificationId;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getNotificationReadTeacherId() {
        return notificationReadTeacherId;
    }

    public void setNotificationReadTeacherId(final Integer notificationReadTeacherId) {
        this.notificationReadTeacherId = notificationReadTeacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(final Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudentRead() {
        return studentRead;
    }

    public void setStudentRead(final String studentRead) {
        this.studentRead = studentRead;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(final Integer notificationId) {
        this.notificationId = notificationId;
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
