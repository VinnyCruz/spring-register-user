package presentation.dto;

import java.time.LocalDate;

public record ClientDto(String nome, String cpf, LocalDate birthDate, String cep, String houseNumber) {

}
