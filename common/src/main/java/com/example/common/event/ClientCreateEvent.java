package com.example.common.event;

import com.example.common.domain.aggregate.Aggregate;
import com.example.common.domain.model.Client;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class ClientCreateEvent extends AbstractEvent {

    public ClientCreateEvent(Client payload) {
        super(null, EventType.CLIENT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
