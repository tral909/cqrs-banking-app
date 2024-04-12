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
public class CardCreateEvent extends AbstractEvent {

    public CardCreateEvent(Object payload) {
        super(null, EventType.CARD_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
