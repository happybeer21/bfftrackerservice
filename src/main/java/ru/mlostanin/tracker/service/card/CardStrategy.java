package ru.mlostanin.tracker.service.card;

import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.CardResponse;

/**
 * Tracking card strategy interface.
 *
 * @author Maxim Ostanin
 * @since 0.0.1
 */
public interface CardStrategy {
    SourceType getSourceType();

    CardResponse getCards(int page, int size);
}
