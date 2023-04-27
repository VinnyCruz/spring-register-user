package com.example.demo.applicationservice.domain.entity;

import com.example.demo.presentation.dto.AddressDto;
import com.example.demo.presentation.dto.ClientDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import com.gtbr.domain.Cep;

@Entity
public class Address {
    public Address() {}

    public Address(ClientDto clientDto, AddressDto addressDto) {
        this.cep = addressDto.cep();
        this.uf = addressDto.uf();
        this.localidade = addressDto.localidade();
        this.bairro = addressDto.bairro();
        this.logradouro = addressDto.logradouro();
        this.numero = clientDto.numero();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdress;
    @NotBlank
    private String cep;

    private String numero;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String bairro;
    @NotBlank
    private String localidade;
    @NotBlank
    private String uf;
    @OneToOne(mappedBy = "address")
    private Client client;

    public Long getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(Long idAdress) {
        this.idAdress = idAdress;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}

