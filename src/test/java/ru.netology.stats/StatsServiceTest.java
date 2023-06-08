package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSalesSum() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedDay = 180;
        int actualDay = service.getSalesSum(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindSalesAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverage = 15;
        int actualAverage = service.getSalesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindSalesMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSalesMax = 8;
        int actualSalesMax = service.getMonthSalesMax(sales);

        Assertions.assertEquals(expectedSalesMax, actualSalesMax);
    }

    @Test
    public void shouldFindSalesMinMonth() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSalesMin = 9;
        int actualSalesMin = service.getMonthSalesMin(sales);

        Assertions.assertEquals(expectedSalesMin, actualSalesMin);
    }

    @Test
    public void shouldFindMonthsUnderAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedUnderAverage = 5;
        int actualUnderAverage = service.getMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedUnderAverage, actualUnderAverage);
    }

    @Test
    public void shouldFindMonthsOverAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedOverAverage = 5;
        int actualOverAverage = service.getMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedOverAverage, actualOverAverage);
    }
}
