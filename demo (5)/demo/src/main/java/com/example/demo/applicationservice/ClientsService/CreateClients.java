package com.example.demo.applicationservice.ClientsService;

import com.example.demo.applicationservice.domain.entity.Client;
import com.example.demo.infrastructure.repository.ClientsRepository;
import com.example.demo.presentation.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateClients {
    @Autowired
    ClientsRepository clientRepository;

    public Client saveClient(ClientDto newClient) {
        return clientRepository.save(new Client(newClient));
    }


}
