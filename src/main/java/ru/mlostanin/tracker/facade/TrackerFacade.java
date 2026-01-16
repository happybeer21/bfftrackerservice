package ru.mlostanin.tracker.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.CardResponse;
import ru.mlostanin.tracker.registry.CardStrategyRegistry;

@Service
@RequiredArgsConstructor
public class TrackerFacade {
    private final CardStrategyRegistry cardStrategyRegistry;

    public CardResponse getCards(SourceType type, int page, int size) {
        return cardStrategyRegistry.getStrategy(type).getCards(page, size);
    }
}
