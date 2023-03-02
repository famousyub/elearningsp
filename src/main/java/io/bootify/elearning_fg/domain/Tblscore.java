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
public class Tblscore {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scoreId;

    @Column(nullable = false)
    private Integer lessonId;

    @Column(nullable = false)
    private Integer exerciseId;

    @Column(nullable = false)
    private Integer studentId;

    @Column(nullable = false)
    private Integer noItems;

    @Column(nullable = false)
    private Integer score;

    @Column(nullable = false)
    private Boolean submitted;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(final Integer scoreId) {
        this.scoreId = scoreId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(final Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(final Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(final Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getNoItems() {
        return noItems;
    }

    public void setNoItems(final Integer noItems) {
        this.noItems = noItems;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(final Integer score) {
        this.score = score;
    }

    public Boolean getSubmitted() {
        return submitted;
    }

    public void setSubmitted(final Boolean submitted) {
        this.submitted = submitted;
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
