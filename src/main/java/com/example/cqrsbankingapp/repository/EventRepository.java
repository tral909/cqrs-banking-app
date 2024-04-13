package com.example.cqrsbankingapp.repository;

import com.example.cqrsbankingapp.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}