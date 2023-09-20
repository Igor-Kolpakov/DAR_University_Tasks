package kz.Dar.University.client.core.api.service;

import kz.Dar.University.client.core.api.model.ClientRequest;
import kz.Dar.University.client.core.api.model.ClientResponse;

import java.util.List;

public interface ClientService {

    ClientResponse createClient(ClientRequest client);

    List<ClientResponse> getAllClients();

    ClientResponse getClientById(String clientId);

    void updateClient(ClientRequest client);

    void deleteClientById(String clientId);

}
