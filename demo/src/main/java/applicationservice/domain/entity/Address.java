package applicationservice.domain.entity;

import com.gtbr.domain.Cep;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Address {
    public Address(Cep cep, String houseNumber) {
        this.cep = cep.getCep();
        this.state = cep.getUf();
        this.city = cep.getLocalidade();
        this.neighborhood = cep.getBairro();
        this.street = cep.getLogradouro();
        this.houseNumber = houseNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdress;
    @NotBlank
    private String cep;
    @NotBlank
    private String houseNumber;
    @NotBlank
    private String street;
    @NotBlank
    private String neighborhood;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
}
