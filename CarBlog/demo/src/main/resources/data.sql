-- Insert sample users
INSERT INTO users (name, email, password) VALUES 
('John Doe', 'john.doe@example.com', 'password123'),
('Jane Smith', 'jane.smith@example.com', 'password456'),
('Alice Johnson', 'alice.johnson@example.com', 'password789');

-- Insert sample blog posts
INSERT INTO blog_posts (title, content, author_id) VALUES 
('First Blog Post', 'This is the content of the first blog post.', 1),
('Second Blog Post', 'This is the content of the second blog post.', 2),
('Third Blog Post', 'This is the content of the third blog post.', 3);

-- Insert sample comments
INSERT INTO comments (text, author_id, post_id) VALUES 
('Great post!', 2, 1),
('Very informative.', 3, 1),
('Thanks for sharing!', 1, 2);

-- Insert sample likes
INSERT INTO likes (user_id, post_id) VALUES 
(1, 1),
(2, 1),
(3, 2),
(1, 3);