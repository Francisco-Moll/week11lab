package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String author;
    private LocalDateTime createdDate;
    private int likes;

    public BlogPost() {
        // Default constructor required by JPA
    }

    public BlogPost(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdDate = LocalDateTime.now();
        this.likes = 0;
    }

    // Getters and Setters
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createdDate=" + createdDate +
                ", likes=" + likes +
                '}';
    }

    // Overriding equals and hashCode for entity comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return id.equals(blogPost.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
