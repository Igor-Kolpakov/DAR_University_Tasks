package kz.Dar.University.post.core.api.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostRequest {
    private String postId;
    @NotNull(message = "Client ID can not be empty")
    private String clientId;
    @NotNull(message = "Post Recipient ID can not be empty")
    private String postRecipientId;
    @NotNull(message = "Post item can not be empty")
    private String postItem;
    @NotNull(message = "Destination address can not be empty")
    private String address;
    private String status;
}
