package applicationservice.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import presentation.dto.ClientDto;

import java.time.LocalDate;

@Entity
public class Client {

    public Client(ClientDto clientDto) {
        this.name = clientDto.name();
        this.cpf = clientDto.cpf();
        this.birthDate = clientDto.birthDate();
        // this.adress = VIACEPAPICLIENT;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private LocalDate birthDate;
    @NotBlank
    private Address adress;
}
