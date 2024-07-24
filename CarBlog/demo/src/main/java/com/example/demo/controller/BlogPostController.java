package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import com.example.demo.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogposts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    @Autowired
    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    // Endpoint to create a new blog post
    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.saveBlogPost(blogPost);
    }

    // Endpoint to get all blog posts
    @GetMapping
    public List<BlogPost> getAllBlogPosts() {
        return blogPostService.findAllBlogPosts();
    }

    // Endpoint to get a specific blog post by its ID
    @GetMapping("/{id}")
    public BlogPost getBlogPostById(@PathVariable Long id) {
        return blogPostService.findBlogPostById(id);
    }

    // Endpoint to like a blog post
    @PostMapping("/{id}/like")
    public BlogPost likeBlogPost(@PathVariable Long id) {
        return blogPostService.likeBlogPost(id);
    }
}
