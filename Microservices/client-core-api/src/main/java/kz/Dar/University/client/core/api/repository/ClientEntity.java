package kz.Dar.University.client.core.api.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "clients_info_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column()
    private String clientId;
    @Column()
    private String clientName;
    @Column()
    private String clientSurname;
    @Column()
    private String clientMail;
    @Column()
    private int clientDocumentNumber;
    @Column()
    private int clientPhone;
    @Column()
    private Date birthDate;
    @Column()
    private String registrationAddress;
    @Column()
    private String posts;
}
