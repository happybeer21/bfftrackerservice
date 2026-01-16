package ru.mlostanin.tracker.service.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.mlostanin.tracker.model.enums.SourceType;

import java.util.Arrays;

@Component
public class StringToSourceTypeConverter implements Converter<String, SourceType> {

    @Override
    public SourceType convert(String source) {
        return Arrays.stream(SourceType.values())
                .filter(sourceType -> sourceType.getType().equalsIgnoreCase(source))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Unknown source type: " + source)
                );
    }
}

