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
public class StudentClassQuiz {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentClassQuizId;

    @Column(nullable = false)
    private Integer classQuizId;

    @Column(nullable = false)
    private Integer studentId;

    @Column(nullable = false, length = 100)
    private String studentQuizTime;

    @Column(nullable = false, length = 100)
    private String grade;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getStudentClassQuizId() {
        return studentClassQuizId;
    }

    public void setStudentClassQuizId(final Integer studentClassQuizId) {
        this.studentClassQuizId = studentClassQuizId;
    }

    public Integer getClassQuizId() {
        return classQuizId;
    }

    public void setClassQuizId(final Integer classQuizId) {
        this.classQuizId = classQuizId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(final Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentQuizTime() {
        return studentQuizTime;
    }

    public void setStudentQuizTime(final String studentQuizTime) {
        this.studentQuizTime = studentQuizTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(final String grade) {
        this.grade = grade;
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
