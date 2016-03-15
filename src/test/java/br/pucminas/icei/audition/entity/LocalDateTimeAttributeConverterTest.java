package br.pucminas.icei.audition.entity;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Giovanni Silva.
 */
public class LocalDateTimeAttributeConverterTest {
    private LocalDateTimeAttributeConverter converter = new LocalDateTimeAttributeConverter();
    @Test
    public void testConvertToDatabaseColumn() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneOffset commonOffSet = ZoneOffset.UTC;
        Timestamp timestamp = converter.convertToDatabaseColumn(localDateTime);
        assertNotNull(timestamp);
        assertEquals(localDateTime, timestamp.toLocalDateTime());
    }

    @Test
    public void testConvertToEntityAttribute() throws Exception {
        Timestamp timestamp = Timestamp.from(Instant.now());
        ZoneOffset commonOffSet = ZoneOffset.UTC;
        LocalDateTime dateTime = converter.convertToEntityAttribute(timestamp);
        assertNotNull(dateTime);
        assertEquals(timestamp.toLocalDateTime(), dateTime);
    }
}