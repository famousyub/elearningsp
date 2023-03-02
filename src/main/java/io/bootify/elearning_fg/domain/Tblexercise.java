package io.bootify.elearning_fg.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Tblexercise {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseId;

    @Column(nullable = false)
    private Integer lessonId;

    @Column(nullable = false, columnDefinition = "longtext")
    private String question;

    @Column(nullable = false, columnDefinition = "longtext")
    private String choiceA;

    @Column(nullable = false, columnDefinition = "longtext")
    private String choiceB;

    @Column(nullable = false, columnDefinition = "longtext")
    private String choiceC;

    @Column(nullable = false, columnDefinition = "longtext")
    private String choiceD;

    @Column(nullable = false, length = 90)
    private String answer;

    @Column(nullable = false)
    private LocalDate exercisesDate;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(final String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(final String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(final String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(final String choiceD) {
        this.choiceD = choiceD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    public LocalDate getExercisesDate() {
        return exercisesDate;
    }

    public void setExercisesDate(final LocalDate exercisesDate) {
        this.exercisesDate = exercisesDate;
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
