package com.example.demo.infrastructure.apiclients;

import com.example.demo.presentation.dto.AddressDto;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCepApiClient", url = "https://viacep.com.br/ws/")
public interface ViaCepApiClient {
    @GetMapping("{cep}/json/")
    public AddressDto getCep(@Valid @PathVariable String cep);
}
