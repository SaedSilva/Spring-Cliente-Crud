package br.dev.saed.clientecrud.repositories;

import br.dev.saed.clientecrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
