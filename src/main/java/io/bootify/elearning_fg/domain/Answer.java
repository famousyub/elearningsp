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
public class Answer {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;

    @Column(nullable = false)
    private Integer quizQuestionId;

    @Column(nullable = false, length = 100)
    private String answerText;

    @Column(nullable = false, length = 3)
    private String choices;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(final Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuizQuestionId() {
        return quizQuestionId;
    }

    public void setQuizQuestionId(final Integer quizQuestionId) {
        this.quizQuestionId = quizQuestionId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(final String answerText) {
        this.answerText = answerText;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(final String choices) {
        this.choices = choices;
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
