package com.example.demo.repository;

import com.example.demo.model.Like;
import com.example.demo.model.BlogPost;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    
    // Custom query method to find Likes by User
    List<Like> findByUser(User user);
    
    // Custom query method to find Likes by BlogPost
    List<Like> findByBlogPost(BlogPost blogPost);
    
    // Custom query method to find a specific Like by User and BlogPost
    Optional<Like> findByUserAndBlogPost(User user, BlogPost blogPost);
}