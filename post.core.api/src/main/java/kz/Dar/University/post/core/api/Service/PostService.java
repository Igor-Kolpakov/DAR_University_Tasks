package kz.Dar.University.post.core.api.Service;

import kz.Dar.University.post.core.api.Model.PostModel;

import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostByPostId(String postId);
    void updatePostByPostId(String postId, PostModel postModel);
    void deletePostByPostId(String postId);
}
