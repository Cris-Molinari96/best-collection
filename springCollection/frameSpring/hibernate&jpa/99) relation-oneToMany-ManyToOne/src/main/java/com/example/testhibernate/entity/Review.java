package com.example.testhibernate.entity;

import jakarta.persistence.*;

@Entity
 @Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idReview;
    @Column(name = "comment")
    private String comment;

    @ManyToOne
    private Course course;

    public Review(String comment) {
        this.comment = comment;
    }

    public Review() {

    }

    public Integer getIdReview() {
        return idReview;
    }

    public void setIdReview(Integer idReview) {
        this.idReview = idReview;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
