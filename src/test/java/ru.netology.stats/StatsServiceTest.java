package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSalesSum() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedDay = 180;
        long actualDay = service.getSalesSum(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindSalesAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedAverage = 15;
        long actualAverage = service.getSalesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindSalesMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedSalesMax = 8;
        long actualSalesMax = service.getMonthSalesMax(sales);

        Assertions.assertEquals(expectedSalesMax, actualSalesMax);
    }

    @Test
    public void shouldFindSalesMinMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedSalesMin = 9;
        long actualSalesMin = service.getMonthSalesMin(sales);

        Assertions.assertEquals(expectedSalesMin, actualSalesMin);
    }

    @Test
    public void shouldFindMonthsUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedUnderAverage = 5;
        long actualUnderAverage = service.getMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedUnderAverage, actualUnderAverage);
    }

    @Test
    public void shouldFindMonthsOverAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedOverAverage = 5;
        long actualOverAverage = service.getMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedOverAverage, actualOverAverage);
    }
}
