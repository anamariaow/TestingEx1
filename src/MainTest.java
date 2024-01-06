import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

    @Test
    void beforeAfterTest() {
        //verifica dei boolean con assert true e false
        assertTrue(data1.isBefore(data2));
        assertFalse(data2.isBefore(data1));
        assertTrue(data2.isAfter(data1));
        assertFalse(data1.isAfter(data2));
        assertFalse(data1.isEqual(data2));
    }

    @Test
    void dateTimeFormatterTest() {
        String dataUno = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String dataDue = data2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        //verifica della stringa con assert not null
        assertNotNull(dataUno);
        assertNotNull(dataDue);
    }
}