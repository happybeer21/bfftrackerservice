package ru.mlostanin.tracker.model.response.card;

import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.details.SourceDetails;

import java.time.LocalDateTime;

/**
 * Card response with common information and specific type details.
 *
 * @param id        product id
 * @param name      product name
 * @param status    product status
 * @param link      link to product
 * @param updatedAt last time product updated
 * @param type      product type
 * @param details   product details
 *
 * @author Maksim Ostanin
 * @since 0.0.1
 */
public record CardResponse(Long id,
                           String name,
                           String status,
                           String link,
                           LocalDateTime updatedAt,
                           SourceType type,
                           SourceDetails details) {
}
