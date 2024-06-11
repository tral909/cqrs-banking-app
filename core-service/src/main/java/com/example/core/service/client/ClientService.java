package com.example.core.service.client;

import com.example.common.domain.model.Client;
import com.example.core.service.CommandService;
import com.example.common.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {

    Client getByUsername(String username);

    boolean existsByUsername(String username);
}