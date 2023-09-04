package kz.Dar.University.post.core.api.controller;

import jakarta.validation.Valid;
import kz.Dar.University.post.core.api.model.PostRequest;
import kz.Dar.University.post.core.api.model.PostResponse;
import kz.Dar.University.post.core.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    Environment env;

    @GetMapping("/check")
    public String check() {

        return "employee-core-api is working at the port " + env.getProperty("local.server.port");

    }

    @PostMapping
    public PostResponse createPost(@RequestBody @Valid PostRequest post) {

        return postService.createPost(post);

    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {

        return postService.getAllPosts();

    }

    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {

        return postService.getPostById(postId);

    }

    @PutMapping("/{postId}")
    public void updatePost(@PathVariable String postId, @RequestBody PostRequest post) {

        post.setPostId(postId);
        postService.updatePost(post);

    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postId) {

        postService.deletePostById(postId);

    }
}
