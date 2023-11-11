package com.example.testhibernate.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    // tabella di dettaglio
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "coruse")
    private String courseName;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "id_istruttore") // chiave esterna, relazione principale
    private Instructor instructor; // mappatura campo Instructor

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_course") // dobbiamo dire ad hibernate come associare le recensioni al corso dato
    //la join funziona che dev'essere specificata nella classe/entity che contiene la chiave primaria, id_course è la chiave esterna di review
    // la tabella review per associa un corso utilizza una fk
    private List<Review> reviewList;

    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", instructor=" + instructor.getLastName() +
                '}';
    }

    public void addReview(Review review) {
        if (reviewList == null) {
            reviewList = new ArrayList<>();
        }
        reviewList.add(review);
    }
}
