package com.example.cqrsbankingapp.event;

import com.example.cqrsbankingapp.domain.aggregate.Aggregate;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class TransactionCreateEvent extends AbstractEvent {

    public TransactionCreateEvent(Object payload) {
        super(null, EventType.TRANSACTION_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}