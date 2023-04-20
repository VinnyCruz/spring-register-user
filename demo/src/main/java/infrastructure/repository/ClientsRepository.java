package infrastructure.repository;

import applicationservice.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    public Client findByCpf(String cpf);
}
