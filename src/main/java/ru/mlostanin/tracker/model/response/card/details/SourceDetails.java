package ru.mlostanin.tracker.model.response.card.details;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Marker interface for details in response.
 *
 * @author Maksim Ostanin
 * @since 0.0.1
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = OrzGkDetailResponse.class)
})
public sealed interface SourceDetails permits OrzGkDetailResponse{
}
