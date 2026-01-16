package ru.mlostanin.tracker.controller.openapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mlostanin.tracker.model.enums.SourceType;
import ru.mlostanin.tracker.model.response.card.CardResponse;

@Tag(name = "tracking", description = "Products tracking")
public interface Tracking {

    @Operation(
            summary = "Receiving product cards",
            description = "Receive user tracking product cards by type",
            operationId = "getCards"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "User cards successfully received",
                    content = {
                            @Content(schema = @Schema(implementation = CardResponse.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE)
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Bad request. Invalid incoming data."
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Not found. Cards by incoming type are not found."
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Service internal error. Request cannot be proceed."
            )
    })
    CardResponse getCards(@RequestParam SourceType type,
                          @RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "20") int size);
}
