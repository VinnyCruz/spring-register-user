package presentation.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import presentation.dto.ClientDto;

@RestController
@RequestMapping("register")
public class ClientsController {
    @PostMapping
    ResponseEntity<ClientDto> createClient(@RequestBody ClientDto newClient) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createClient.saveClient(newClient));
    }
}
