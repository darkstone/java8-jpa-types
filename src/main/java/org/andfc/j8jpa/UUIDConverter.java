package org.andfc.j8jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

/**
 * Converter to handle the conversion java's {@link UUID} to {@link String}
 */
@Converter
public class UUIDConverter implements AttributeConverter<UUID,String> {

    @Override
    public String convertToDatabaseColumn(UUID attribute) {
        String s;
        if (attribute == null) {
            s = null;
        } else {
            s = attribute.toString();
        }
        return s;
    }

    @Override
    public UUID convertToEntityAttribute(String dbData) {
        UUID uuid;
        if (dbData == null) {
            uuid = null;
        } else {
            uuid = UUID.fromString(dbData);
        }
        return uuid;
    }
}
