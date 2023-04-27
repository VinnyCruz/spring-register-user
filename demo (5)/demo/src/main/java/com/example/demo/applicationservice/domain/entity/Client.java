package com.example.demo.applicationservice.domain.entity;
import com.example.demo.presentation.dto.AddressDto;
import com.example.demo.presentation.dto.ClientDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

@Entity
public class Client {

    public Client(ClientDto clientDto, AddressDto address) {
        this.nome = clientDto.nome();
        this.cpf = clientDto.cpf();
        this.dataNascimento = clientDto.dataNascimento();
        this.address = new Address(clientDto, address);
    }

    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @PastOrPresent
    private LocalDate dataNascimento;
    @OneToOne(cascade = CascadeType.ALL) //Linka os dois em qualquer requisição
    @JoinColumn
    private Address address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
