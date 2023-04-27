package com.example.demo.applicationservice.ClientsService;

import com.example.demo.applicationservice.domain.entity.Address;
import com.example.demo.applicationservice.domain.entity.Client;
import com.example.demo.infrastructure.apiclients.ViaCepApiClient;
import com.example.demo.infrastructure.repository.ClientsRepository;
import com.example.demo.presentation.dto.AddressDto;
import com.example.demo.presentation.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateClients {
    @Autowired
    ViaCepApiClient viaCepApiClient;
    @Autowired
    ClientsRepository clientRepository;

    public Client saveClient(ClientDto newClient) {
        return clientRepository.save(new Client(newClient, validarCep(newClient)));
    }

    public AddressDto validarCep(ClientDto newClient) {
        AddressDto getCep = viaCepApiClient.getCep(newClient.cep());
        return getCep;
    }
}
