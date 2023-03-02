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
public class Tblautonumbers {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autoid;

    @Column(nullable = false, length = 30)
    private String autostart;

    @Column(nullable = false)
    private Integer autoend;

    @Column(nullable = false)
    private Integer autoinc;

    @Column(nullable = false, length = 30)
    private String autokey;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(final Integer autoid) {
        this.autoid = autoid;
    }

    public String getAutostart() {
        return autostart;
    }

    public void setAutostart(final String autostart) {
        this.autostart = autostart;
    }

    public Integer getAutoend() {
        return autoend;
    }

    public void setAutoend(final Integer autoend) {
        this.autoend = autoend;
    }

    public Integer getAutoinc() {
        return autoinc;
    }

    public void setAutoinc(final Integer autoinc) {
        this.autoinc = autoinc;
    }

    public String getAutokey() {
        return autokey;
    }

    public void setAutokey(final String autokey) {
        this.autokey = autokey;
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
