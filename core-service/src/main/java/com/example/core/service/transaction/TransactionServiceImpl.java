package com.example.core.service.transaction;

import com.example.common.domain.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionQueryService transactionQueryService;
    private final TransactionCommandService transactionCommandService;

    @Override
    public void create(Transaction object) {
        transactionCommandService.create(object);
    }

    @Override
    public Transaction getById(UUID id) {
        return transactionQueryService.getById(id);
    }
}
