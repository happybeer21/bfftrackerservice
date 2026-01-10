package ru.mlostanin.tracker.controller.openapi;

import org.springframework.http.ResponseEntity;

public interface Card<T> {
    ResponseEntity<T> getCard(Long id);
}
