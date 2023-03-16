package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestScheduleServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/entryData.csv")
    public void firstExample(int income, int expenses, int threshold, int expected) {
        RestScheduleService service = new RestScheduleService();

        // Подготавливаем данные
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
