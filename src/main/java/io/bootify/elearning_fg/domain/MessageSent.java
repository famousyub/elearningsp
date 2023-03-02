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
public class MessageSent {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageSentId;

    @Column(nullable = false)
    private Integer recieverId;

    @Column(nullable = false, length = 200)
    private String content;

    @Column(nullable = false, length = 100)
    private String dateSended;

    @Column(nullable = false)
    private Integer senderId;

    @Column(nullable = false, length = 100)
    private String recieverName;

    @Column(nullable = false, length = 100)
    private String senderName;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getMessageSentId() {
        return messageSentId;
    }

    public void setMessageSentId(final Integer messageSentId) {
        this.messageSentId = messageSentId;
    }

    public Integer getRecieverId() {
        return recieverId;
    }

    public void setRecieverId(final Integer recieverId) {
        this.recieverId = recieverId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public String getDateSended() {
        return dateSended;
    }

    public void setDateSended(final String dateSended) {
        this.dateSended = dateSended;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(final Integer senderId) {
        this.senderId = senderId;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(final String recieverName) {
        this.recieverName = recieverName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(final String senderName) {
        this.senderName = senderName;
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
