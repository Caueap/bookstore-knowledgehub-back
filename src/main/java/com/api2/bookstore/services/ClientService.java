package com.api2.bookstore.services;

import com.api2.bookstore.dtos.ClientDto;
import com.api2.bookstore.models.ClientModel;
import com.api2.bookstore.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {

    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public ClientModel save(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    public Optional<ClientModel> findById(UUID id) {
        return clientRepository.findById(id);
    }

    @Transactional
    public void delete(ClientModel clientModel) {
        clientRepository.delete(clientModel);
    }

    public boolean existsByEmail(String email) {
        return clientRepository.existsByEmail(email);
    }

}
