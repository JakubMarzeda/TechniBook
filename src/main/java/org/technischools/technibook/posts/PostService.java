package org.technischools.technibook.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.posts.api.CreatePostRequest;

import java.util.Date;
import java.util.UUID;
@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(CreatePostRequest createUserRequest) {
        Post newPost = Post.builder()
                .uuid(UUID.randomUUID().toString())
                .userId(createUserRequest.getUserId())
                .content(createUserRequest.getContent())
                .createdDate(new Date())
                .build();
        Post createdPost = postRepository.save(newPost);
        return createdPost;
    }

    public Post getPost(String uuid) {
        return postRepository.findByUuid(uuid);
    }
}
