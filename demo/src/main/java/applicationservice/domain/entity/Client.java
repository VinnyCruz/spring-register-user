package applicationservice.domain.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Client {
    private String nome;
    private String cpf;
    private LocalDate birthDate;
    private Address adress;
}
