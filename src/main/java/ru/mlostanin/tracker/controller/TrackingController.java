package ru.mlostanin.tracker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mlostanin.tracker.controller.openapi.Tracking;
import ru.mlostanin.tracker.facade.TrackerFacade;
import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.CardResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("${ru.mlostanin.bfftrackerservice.track.request-mapping}")
public class TrackingController implements Tracking {

    private final TrackerFacade trackerFacade;

    @GetMapping("/cards")
    @Override
    public CardResponse getCards(@RequestParam SourceType type,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "20") int size) {
        return trackerFacade.getCards(type, page, size);
    }
}
