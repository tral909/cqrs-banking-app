package com.example.cqrsbankingapp.service.client;

import com.example.cqrsbankingapp.domain.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientQueryService clientQueryService;
    private final ClientCommandService clientCommandService;

    @Override
    public void create(Client object) {
        clientCommandService.create(object);
    }

    @Override
    public Client getById(UUID id) {
        return clientQueryService.getById(id);
    }
}
