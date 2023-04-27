package com.example.demo.presentation.dto;

import com.example.demo.applicationservice.domain.entity.Address;

import java.time.LocalDate;

public record ClientDto(String nome, String cpf, LocalDate dataNascimento, String cep, String numero){
};