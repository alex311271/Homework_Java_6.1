package ru.netology.homevork.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.homework.stats.StatsService;

public class StatServiceTest {
    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        long expected = 5948;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        int expected = 495;
        int actual = (int) service.averageMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        long expected = 5;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        long expected = 12;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMaxSales(){
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        long expected = 7;
        long actual = service.monthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinSales(){
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        long expected = 5;
        long actual = service.monthMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
