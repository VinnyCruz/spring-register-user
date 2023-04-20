package applicationservice.ClientsService;

import applicationservice.domain.entity.Client;
import infrastructure.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import presentation.dto.ClientDto;

public class CreateClients {
    @Autowired
    ClientsRepository clientRepository;

    public ClientDto saveClient(ClientDto newClient) {
        clientRepository.save(new Client(newClient));
        return newClient;

    }
}
