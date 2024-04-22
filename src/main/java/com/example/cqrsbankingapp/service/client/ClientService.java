package com.example.cqrsbankingapp.service.client;

import com.example.cqrsbankingapp.domain.model.Client;
import com.example.cqrsbankingapp.service.CommandService;
import com.example.cqrsbankingapp.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {

    Client getByUsername(String username);

    boolean existsByUsername(String username);
}