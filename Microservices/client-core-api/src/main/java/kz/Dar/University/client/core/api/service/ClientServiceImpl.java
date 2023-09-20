package kz.Dar.University.client.core.api.service;

import kz.Dar.University.client.core.api.model.ClientRequest;
import kz.Dar.University.client.core.api.model.ClientResponse;
import kz.Dar.University.client.core.api.repository.ClientEntity;
import kz.Dar.University.client.core.api.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    ModelMapper mapper = new ModelMapper();
    { mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); }

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientResponse createClient(ClientRequest client) {
        client.setClientId(UUID.randomUUID().toString());

        ClientEntity entity = mapper.map(client, ClientEntity.class);
        ClientEntity result = clientRepository.save(entity);

        return mapper.map(result, ClientResponse.class);
    }

    @Override
    public List<ClientResponse> getAllClients() {
        return clientRepository.getClientEntitiesBy().stream().map(post -> mapper.map(post, ClientResponse.class)).toList();
    }

    @Override
    public ClientResponse getClientById(String clientId) {
        ClientEntity result = clientRepository.getClientEntityByClientId(clientId);
        return mapper.map(result, ClientResponse.class);
    }

    @Override
    public void updateClient(ClientRequest client) {

    }

    @Override
    public void deleteClientById(String clientId) {
        clientRepository.deleteClientEntityByClientId(clientId);
    }
}
