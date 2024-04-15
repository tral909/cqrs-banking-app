package com.example.cqrsbankingapp.repository;

import com.example.cqrsbankingapp.event.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}