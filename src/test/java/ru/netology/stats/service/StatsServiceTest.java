package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};

        int expectedSum = 170;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};

        int expectedAverage = 14;
        int actualAverage = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void quantityBelowTheAverageValue() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};
        int expectedMonth = 4;
        int actualMonth = service.belowTheAverageValue(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void quantityAboveTheAverageValue() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 8};
        int expected = 6;
        int actual = service.aboveTheAverageValue(sales);

        Assertions.assertEquals(expected, actual);
    }


}
