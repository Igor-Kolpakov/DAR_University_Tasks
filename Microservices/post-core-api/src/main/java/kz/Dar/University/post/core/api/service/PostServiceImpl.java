package kz.Dar.University.post.core.api.service;

import kz.Dar.University.post.core.api.model.PostRequest;
import kz.Dar.University.post.core.api.model.PostResponse;
import kz.Dar.University.post.core.api.repository.PostEntity;
import kz.Dar.University.post.core.api.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    ModelMapper mapper = new ModelMapper();
    { mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); }

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostResponse createPost(PostRequest post) {
        post.setPostId(UUID.randomUUID().toString());

        PostEntity entity = mapper.map(post, PostEntity.class);
        PostEntity result = postRepository.save(entity);

        return mapper.map(result, PostResponse.class);
    }

    @Override
    public List<PostResponse> getAllPosts() {
        return postRepository.getPostEntitiesBy().stream().map(post -> mapper.map(post, PostResponse.class)).toList();
    }

    @Override
    public PostResponse getPostById(String postId) {
        PostEntity result = postRepository.getPostEntityByPostId(postId);
        return mapper.map(result, PostResponse.class);
    }

    @Override
    public void updatePost(PostRequest post) {
        PostRequest request = mapper.map(post, PostRequest.class);
        /* if () {
            createPost(request);
        } */
    }

    @Override
    public void deletePostById(String postId) {
        postRepository.deletePostEntityByPostId(postId);
    }
}
