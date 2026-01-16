package ru.mlostanin.tracker.model.enums;

import lombok.Getter;

/**
 * Tracking source types.
 *
 * @author Maksim Ostanin
 * @since 0.0.1
 */
@Getter
public enum SourceType {
    ORZ_GK("orzgk"),
    OZON("ozon");

    private final String type;

    SourceType(String type) {
        this.type = type;
    }
}
