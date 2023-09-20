package kz.Dar.University.client.core.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

    List<ClientEntity> getClientEntitiesBy();

    ClientEntity getClientEntityByClientId(String clientId);

    void deleteClientEntityByClientId(String clientId);
}
