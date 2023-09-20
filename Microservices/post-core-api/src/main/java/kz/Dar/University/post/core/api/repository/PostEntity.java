package kz.Dar.University.post.core.api.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Entity
@Table(name = "posts_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true, nullable = false,length = 36 , name ="posts_id")
    private String postId;
    @Column(unique = true, nullable = false, length = 36, name ="client_id")
    private String clientId;
    @Column(unique = true, nullable = false, length = 36, name ="post_recipient_id")
    private String postRecipientId;
    @Column(unique = true, nullable = false, length = 36, name ="post_item")
    private String postItem;
    @Column()
    private String address;
    @Column(nullable = false, length = 50, name ="status")
    private String status;

}