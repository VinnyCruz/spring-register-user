package com.example.demo.infrastructure.repository;

import com.example.demo.applicationservice.domain.entity.Client;
import com.example.demo.presentation.dto.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    public Optional<Client> findByCpf(String cpf);
    @Override
    Optional<Client> findById(Long id);

}
