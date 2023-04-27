package com.example.demo.applicationservice.ClientsService;

import com.example.demo.applicationservice.domain.entity.Client;
import com.example.demo.infrastructure.repository.ClientsRepository;
import com.example.demo.presentation.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SearchClients {
    @Autowired
    ClientsRepository clientRepository;

    public List<Client> listAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> findClientByCpf(String cpf) {
        return clientRepository.findByCpf(cpf);
    }

    public Optional<Client> findClientById(Long id) {
        Optional<Client> clientFoundById = clientRepository.findById(id);
        return clientFoundById;
    }
}
