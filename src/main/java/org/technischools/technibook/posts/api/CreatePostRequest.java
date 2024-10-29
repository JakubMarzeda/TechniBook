package org.technischools.technibook.posts.api;

import lombok.Data;
@Data
public class CreatePostRequest {
    private String userId;
    private String content;
}
