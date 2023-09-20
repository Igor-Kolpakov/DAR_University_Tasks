package kz.Dar.University.client.core.api.controller;

import jakarta.validation.Valid;
import kz.Dar.University.client.core.api.model.ClientRequest;
import kz.Dar.University.client.core.api.model.ClientResponse;
import kz.Dar.University.client.core.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    Environment env;

    @GetMapping("/check")
    public String check() {

        return "client-core-api is working at the port " + env.getProperty("local.server.port");

    }

    @PostMapping
    public ClientResponse createClient(@RequestBody @Valid ClientRequest client) {

        return clientService.createClient(client);

    }

    @GetMapping("/all")
    public List<ClientResponse> getAllClients() {

        return clientService.getAllClients();

    }

    @GetMapping
    public ClientResponse getClientById(@RequestParam String clientId) {

        return clientService.getClientById(clientId);

    }

    @PutMapping("/{clientId}")
    public void updateClient(@PathVariable String clientId, @RequestBody ClientRequest client) {

        client.setClientId(clientId);
        clientService.updateClient(client);

    }

    @DeleteMapping("/{clientId}")
    public void deleteClientById(@PathVariable String clientId) {

        clientService.deleteClientById(clientId);

    }
}
