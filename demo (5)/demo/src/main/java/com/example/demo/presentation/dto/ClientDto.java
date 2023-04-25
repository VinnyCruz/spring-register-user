package com.example.demo.presentation.dto;

import java.time.LocalDate;

public record ClientDto(String nome, String cpf, LocalDate dataNascimento){};
