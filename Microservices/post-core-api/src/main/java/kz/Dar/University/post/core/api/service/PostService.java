package kz.Dar.University.post.core.api.service;

import kz.Dar.University.post.core.api.model.PostRequest;
import kz.Dar.University.post.core.api.model.PostResponse;

import java.util.List;

public interface PostService {

    PostResponse createPost(PostRequest post);

    List<PostResponse> getAllPosts();

    PostResponse getPostById(String postId);

    void updatePost(PostRequest post);

    void deletePostById(String postId);

}
