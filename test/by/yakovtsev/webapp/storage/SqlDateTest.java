package by.yakovtsev.webapp.storage;

import by.yakovtsev.webapp.WebAppConfig;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SqlDateTest {
    @Test
    public void testInsertDate() throws Exception {
        SqlStorage storage = (SqlStorage) WebAppConfig.get().getStorage();
        storage.insertDate(LocalDate.now(), LocalDate.of(2015, Month.FEBRUARY, 23));
    }
}