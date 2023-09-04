package kz.Dar.University.post.core.api.Model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostModel {
    private String postId;
    @NotNull(message = "Client ID can not be empty")
    private String clientId;
    @NotNull(message = "Post Recipient ID can not be empty")
    private String postRecipientId;
    @NotNull(message = "Name can not be empty")
    @Size(min = 2, max = 16, message = "Post Item must be greater than 2 and less than 16")
    private String postItem;
    private String status;
}



/*
String postId - ID посылки
String clientId - ID клиента (@NotNull) - поле обязательное к заполнению
String postRecipientId - ID получателя (@NotNull) - поле обязательное к заполнению
String postItem - Наименование посылки (@NotNull) - поле обязательное к заполнению
String status - Статус заказа
 */
