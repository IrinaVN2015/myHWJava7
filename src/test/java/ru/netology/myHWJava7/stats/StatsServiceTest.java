package ru.netology.myHWJava7.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 180;
        int actualSumMonth = service.sumSales(sales);
        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        double actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindNomMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindNomMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = (int) service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthsLowestSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedGreatestSales = 5;
        int actualGreatestSales = service.monthsLowestSales(sales);
        Assertions.assertEquals(expectedGreatestSales, actualGreatestSales);
    }

    @Test
    public void shouldFindMonthsGreatestSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedGreatestSales = 5;
        int actualGreatestSales = service.monthsGreatestSales(sales);
        Assertions.assertEquals(expectedGreatestSales, actualGreatestSales);
    }
}



