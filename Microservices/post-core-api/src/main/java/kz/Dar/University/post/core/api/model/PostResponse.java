package kz.Dar.University.post.core.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {

    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String address;
    private String status;

}
