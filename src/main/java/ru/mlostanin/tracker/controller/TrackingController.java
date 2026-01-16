package ru.mlostanin.tracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mlostanin.tracker.model.response.card.CardResponse;

@RestController
public class TrackingController {

    @GetMapping("/{type}")
    public ResponseEntity<CardResponse> getCard(String type, int page, int size) {
        return ResponseEntity.ok().build();
    }
}
