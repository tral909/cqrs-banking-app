package com.example.cqrsbankingapp.service.card;

import com.example.cqrsbankingapp.domain.model.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardQueryService cardQueryService;
    private final CardCommandService cardCommandService;

    @Override
    public void create(Card object) {
        cardCommandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return cardQueryService.getById(id);
    }

}
