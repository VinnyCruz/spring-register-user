package com.example.demo.presentation.controller;

import com.example.demo.applicationservice.ClientsService.CreateClients;
import com.example.demo.applicationservice.ClientsService.SearchClients;
import com.example.demo.applicationservice.domain.entity.Client;
import com.example.demo.presentation.dto.ClientDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("clients")
public class ClientsController {
    @Autowired
    private CreateClients createClient;
    @Autowired
    private SearchClients searchClient;

    @GetMapping("search/all")
    public ResponseEntity<List<Client>> listAll() {
        return ResponseEntity.ok(searchClient.listAll());
    }

    @PostMapping("register")
    ResponseEntity<Client> createClient(@RequestBody @Valid ClientDto newClient) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createClient.saveClient(newClient));
    }

    @GetMapping("search/cpf/{cpf}")
    ResponseEntity<Optional<Client>> findClientByCpf(@PathVariable String cpf) {
        Optional<Client> clientBeenSearch = searchClient.findClientByCpf(cpf);
        return ResponseEntity.ok(clientBeenSearch);
    }

    @GetMapping("search/id")
    ResponseEntity<Optional<Client>> findClientById(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.FOUND).body(searchClient.findClientById(id));
    }
}
