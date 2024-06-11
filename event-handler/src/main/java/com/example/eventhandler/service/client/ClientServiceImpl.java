package com.example.eventhandler.service.client;

import com.example.common.domain.model.Account;
import com.example.common.domain.model.Client;
import com.example.common.repository.ClientRepository;
import com.example.eventhandler.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;
    private final AccountService accountService;

    @Override
    @Transactional
    public Client create(Client client) {
        Account account = new Account();
        account = accountService.create(account);
        client.setAccount(account);
        return repository.save(client);
    }

    @Override
    @Transactional
    public void addCard(UUID clientId, UUID cardId) {
        repository.addCard(clientId.toString(), cardId.toString());
    }
}