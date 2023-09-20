package kz.Dar.University.client.core.api.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    private String clientId;
    @NotNull(message = "Name can not be empty")
    @Size(min = 2, max = 50, message = "Name must be greater than 2 and less than 16")
    private String clientName;
    @NotNull(message = "Surname can not be empty")
    @Size(min = 2, max = 50, message = "Name must be greater than 2 and less than 16")
    private String clientSurname;
    @NotNull(message = "Mail can not be empty")
    @Email
    private String clientMail;
    @NotNull(message = "Surname can not be empty")
    @Size(min = 12, max = 12, message = "Document number must include only 12 numbers")
    private int clientDocumentNumber;
    @NotNull(message = "Phone can not be empty")
    private int clientPhone;
    @NotNull(message = "Birth date can not be empty")
    private Date birthDate;
    @NotNull(message = "Registration address can not be empty")
    @Size(min = 2, max = 255, message = "Registration number must include at least 2 letters")
    private String registrationAddress;
    private String posts;
}
