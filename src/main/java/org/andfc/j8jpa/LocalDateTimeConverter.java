package org.andfc.j8jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * A converter convert {@link LocalDateTime} to a {@link Timestamp}
 */

@Converter
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime,Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {

        Timestamp result = null;

        if (attribute != null) {
            result = Timestamp.valueOf(attribute);
        }

        return result;
    }


    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp dbData) {

        LocalDateTime result = null;

        if (dbData != null) {
            result = dbData.toLocalDateTime();
        }

        return result;

    }
}
