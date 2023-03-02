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
public class TeacherShared {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherSharedId;

    @Column(nullable = false)
    private Integer teacherId;

    @Column(nullable = false)
    private Integer sharedTeacherId;

    @Column(nullable = false, length = 100)
    private String floc;

    @Column(nullable = false, length = 100)
    private String fdatein;

    @Column(nullable = false, length = 100)
    private String fdesc;

    @Column(nullable = false, length = 100)
    private String fname;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getTeacherSharedId() {
        return teacherSharedId;
    }

    public void setTeacherSharedId(final Integer teacherSharedId) {
        this.teacherSharedId = teacherSharedId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(final Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSharedTeacherId() {
        return sharedTeacherId;
    }

    public void setSharedTeacherId(final Integer sharedTeacherId) {
        this.sharedTeacherId = sharedTeacherId;
    }

    public String getFloc() {
        return floc;
    }

    public void setFloc(final String floc) {
        this.floc = floc;
    }

    public String getFdatein() {
        return fdatein;
    }

    public void setFdatein(final String fdatein) {
        this.fdatein = fdatein;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(final String fdesc) {
        this.fdesc = fdesc;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(final String fname) {
        this.fname = fname;
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
