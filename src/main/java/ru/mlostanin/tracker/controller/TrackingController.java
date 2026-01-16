package ru.mlostanin.tracker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mlostanin.tracker.controller.openapi.Tracking;
import ru.mlostanin.tracker.facade.TrackerFacade;
import ru.mlostanin.tracker.model.response.card.CardResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tracking") //todo: replace with property
public class TrackingController implements Tracking {

    private final TrackerFacade trackerFacade;

    @GetMapping("/{type}")
    @Override
    public CardResponse getCards(String type, int page, int size) {
        return CardResponse.builder().build();
    }
}
