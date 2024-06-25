package br.dev.saed.clientecrud.controllers;

import br.dev.saed.clientecrud.dto.ClientDTO;
import br.dev.saed.clientecrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
