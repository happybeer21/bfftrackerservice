package ru.mlostanin.tracker.service.card.impl;

import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.CardResponse;
import ru.mlostanin.tracker.service.card.CardStrategy;

/**
 * Orz GK figures store tracker strategy impl.
 *
 * @author maximostanin
 * @since 0.0.1
 */
public class OrzGKCardStrategyImpl implements CardStrategy {

    @Override
    public SourceType getSourceType() {
        return SourceType.ORZ_GK;
    }

    @Override
    public CardResponse getCards(int page, int size) {
        //TODO: go to catalog, receive from DB
        return null;
    }
}
