package kz.Dar.University.post.core.api.Controller;


import jakarta.validation.Valid;
import kz.Dar.University.post.core.api.Model.PostModel;
import kz.Dar.University.post.core.api.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostModelController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody @Valid PostModel postModel) {
        postService.createPost(postModel);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts () {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostByPostId(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostByPostId (@PathVariable String postId,
                                                      @RequestBody @Valid  PostModel postModel) {
        postService.updatePostByPostId(postId, postModel);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostByPostId(@PathVariable String postId) {
        postService.deletePostByPostId(postId);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
    }
}




