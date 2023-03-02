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
public class Tblstudentquestion {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sqid;

    @Column(nullable = false)
    private Integer exerciseId;

    @Column(nullable = false)
    private Integer lessonId;

    @Column(nullable = false)
    private Integer studentId;

    @Column(nullable = false, length = 90)
    private String question;

    @Column(nullable = false, length = 90)
    private String ca;

    @Column(nullable = false, length = 90)
    private String cb;

    @Column(nullable = false, length = 90)
    private String cc;

    @Column(nullable = false, length = 90)
    private String cd;

    @Column(nullable = false, length = 90)
    private String qa;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getSqid() {
        return sqid;
    }

    public void setSqid(final Integer sqid) {
        this.sqid = sqid;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(final Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(final Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(final Integer studentId) {
        this.studentId = studentId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(final String ca) {
        this.ca = ca;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(final String cb) {
        this.cb = cb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(final String cc) {
        this.cc = cc;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(final String cd) {
        this.cd = cd;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(final String qa) {
        this.qa = qa;
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
