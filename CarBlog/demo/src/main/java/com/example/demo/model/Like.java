package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "blog_post_id", nullable = false)
    private BlogPost blogPost;

    public Like() {
        // Default constructor required by JPA
    }

    public Like(User user, BlogPost blogPost) {
        this.user = user;
        this.blogPost = blogPost;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BlogPost getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(BlogPost blogPost) {
        this.blogPost = blogPost;
    }

    // Overriding equals and hashCode for entity comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return Objects.equals(id, like.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", user=" + user +
                ", blogPost=" + blogPost +
                '}';
    }
}
