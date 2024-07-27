package com.example.demo.service;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    // Method to save a new blog post
    public BlogPost saveBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    // Method to retrieve all blog posts
    public List<BlogPost> findAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    // Method to find a blog post by its ID
    public BlogPost findBlogPostById(Long id) {
        Optional<BlogPost> blogPost = blogPostRepository.findById(id);
        return blogPost.orElse(null);
    }

    // Method to like a blog post
    public BlogPost likeBlogPost(Long id) {
        Optional<BlogPost> blogPostOptional = blogPostRepository.findById(id);
        if (blogPostOptional.isPresent()) {
            BlogPost blogPost = blogPostOptional.get();
            blogPost.setLikes(blogPost.getLikes() + 1);
            return blogPostRepository.save(blogPost);
        } else {
            return null;
        }
    }
}
