package com.example.demo.repository;

import com.example.demo.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    // Custom query method to find BlogPosts by author
    List<BlogPost> findByAuthor(String author);
    
    // Custom query method to find BlogPosts containing a specific keyword in the title
    List<BlogPost> findByTitleContaining(String keyword);
    
    // Custom query method to find BlogPosts created before a certain date
    List<BlogPost> findByCreatedDateBefore(LocalDateTime date);
}