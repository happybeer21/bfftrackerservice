package ru.mlostanin.tracker.registry;

import org.springframework.stereotype.Component;
import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.service.card.CardStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CardStrategyRegistry {
    private final Map<SourceType, CardStrategy> cardStrategyMap = new HashMap<>();

    public CardStrategyRegistry(List<CardStrategy> cardStrategies) {
        for (CardStrategy strategy : cardStrategies) {
            SourceType type = strategy.getSourceType();
            cardStrategyMap.put(type, strategy);
        }
    }

    public CardStrategy getStrategy(SourceType type) {
        return cardStrategyMap.get(type);
    }
}
