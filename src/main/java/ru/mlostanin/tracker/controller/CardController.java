package ru.mlostanin.tracker.controller;

import org.springframework.http.ResponseEntity;
import ru.mlostanin.tracker.controller.openapi.Card;

public class CardController implements Card<Void> {

    @Override
    public ResponseEntity<Void> getCard(Long id) {
        return ResponseEntity.ok().build();
    }
}
