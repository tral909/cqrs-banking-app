package com.example.common.service.card;

import com.example.common.domain.exception.ResourceNotFoundException;
import com.example.common.domain.model.Card;
import com.example.common.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService {

    private final CardRepository repository;

    @Override
    public Card getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByNumberAndDate(String number, String date) {
        return repository.existsByNumberAndDate(number, date);
    }

    @Override
    public Card getByNumberAndDateAndCvv(String number, String date, String cvv) {
        return repository.getByNumberAndDateAndCvv(number, date, cvv)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Card getByNumberAndDate(String number, String date) {
        return repository.findByNumberAndDate(number, date)
                .orElseThrow(ResourceNotFoundException::new);
    }
}