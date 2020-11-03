package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numberStar;
    private String author;
    private String feedback;

    public Comment() {
    }

    public Comment(Long id, int numberStar, String author, String feedback) {
        this.id = id;
        this.numberStar = numberStar;
        this.author = author;
        this.feedback = feedback;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberStar() {
        return numberStar;
    }

    public void setNumberStar(int numberStar) {
        this.numberStar = numberStar;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "com.codegym.model.Picture{" +
                "id=" + id +
                ", numberStar=" + numberStar +
                ", author='" + author + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
