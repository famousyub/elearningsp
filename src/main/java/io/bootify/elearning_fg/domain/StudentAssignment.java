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
public class StudentAssignment {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentAssignmentId;

    @Column(nullable = false)
    private Integer assignmentId;

    @Column(nullable = false, length = 100)
    private String floc;

    @Column(nullable = false, length = 50)
    private String assignmentFdatein;

    @Column(nullable = false, length = 100)
    private String fdesc;

    @Column(nullable = false, length = 50)
    private String fname;

    @Column(nullable = false)
    private Integer studentId;

    @Column(nullable = false, length = 5)
    private String grade;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getStudentAssignmentId() {
        return studentAssignmentId;
    }

    public void setStudentAssignmentId(final Integer studentAssignmentId) {
        this.studentAssignmentId = studentAssignmentId;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(final Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getFloc() {
        return floc;
    }

    public void setFloc(final String floc) {
        this.floc = floc;
    }

    public String getAssignmentFdatein() {
        return assignmentFdatein;
    }

    public void setAssignmentFdatein(final String assignmentFdatein) {
        this.assignmentFdatein = assignmentFdatein;
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(final Integer studentId) {
        this.studentId = studentId;
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
