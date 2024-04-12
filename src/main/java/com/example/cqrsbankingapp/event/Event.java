package com.example.cqrsbankingapp.event;

import com.example.cqrsbankingapp.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);
}
