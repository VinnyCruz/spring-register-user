package presentation.dto;

import java.time.LocalDate;

public record ClientDto(String name, String cpf, LocalDate birthDate, String cep, String houseNumber){};
