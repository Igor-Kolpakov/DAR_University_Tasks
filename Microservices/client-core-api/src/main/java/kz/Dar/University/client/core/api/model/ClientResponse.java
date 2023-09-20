package kz.Dar.University.client.core.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {
    private String clientId;
    private String clientName;
    private String clientSurname;
    private String clientMail;
    private int clientPhone;
    private Date birthDate;
    private String posts;
}
