package com.example.eventhandler.service.card;

import com.example.common.domain.model.Card;
import com.example.common.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository repository;

    @Override
    public Card create(Card card) {
        card.setNumber(UUID.randomUUID().toString());
        //todo set number date and cvv
        return repository.save(card);
    }
}
