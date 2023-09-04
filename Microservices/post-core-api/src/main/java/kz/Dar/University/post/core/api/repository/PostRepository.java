package kz.Dar.University.post.core.api.repository;

import lombok.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {

    List<PostEntity> getPostEntitiesBy();

    PostEntity getPostEntityByPostId(String postId);

    void deletePostEntityByPostId(String postId);

}
