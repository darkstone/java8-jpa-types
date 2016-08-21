package org.andfc.j8jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Converts a java 8 {@link LocalDate} to {@link Date}
 */

@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate,Date> {


    @Override
    public Date convertToDatabaseColumn(LocalDate attribute) {

        Date date = null;

        if (attribute != null) {
            date = Date.valueOf(attribute);
        }

        return date;
    }

    @Override
    public LocalDate convertToEntityAttribute(Date dbData) {

        LocalDate localDate = null;

        if (dbData != null) {
            localDate = dbData.toLocalDate();
        }

        return localDate;
    }
}
