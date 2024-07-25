-- Insert initial users
INSERT INTO users (name, email, password)
VALUES ('Alice Johnson', 'alice@example.com', 'password123'),
       ('Bob Smith', 'bob@example.com', 'password123'),
       ('Charlie Brown', 'charlie@example.com', 'password123');

-- Insert initial blog posts
INSERT INTO blog_posts (title, content, author_id)
VALUES ('My First Blog Post', 'This is the content of my first blog post.', 1),
       ('Another Post by Alice', 'Here is another interesting post.', 1),
       ('Bobs Insights', 'Bob shares his insights on various topics.', 2);

-- Insert initial comments
INSERT INTO comments (text, author_id, post_id)
VALUES ('Great post, Alice!', 2, 1),
       ('I learned a lot from this post.', 3, 1),
       ('Interesting insights, Bob.', 1, 3);

-- Insert initial likes
INSERT INTO likes (user_id, post_id)
VALUES (1, 3),
       (2, 1),
       (3, 1),
       (3, 2);
