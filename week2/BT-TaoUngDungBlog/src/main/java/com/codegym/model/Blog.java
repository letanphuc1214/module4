package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String image;
    @Column(name="content",columnDefinition="LONGTEXT")
    private String content;

    public Blog() {
    }

    public Blog(Long id, String title, String image, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
