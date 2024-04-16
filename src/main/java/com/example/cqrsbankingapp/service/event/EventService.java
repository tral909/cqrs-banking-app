package com.example.cqrsbankingapp.service.event;

import com.example.cqrsbankingapp.event.AbstractEvent;

public interface EventService {

    void create(AbstractEvent event);
}
