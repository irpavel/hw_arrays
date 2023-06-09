package ru.netology.stats;

public class StatsService {
    public long getSalesSum(long[] sales) {
        long salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public long getSalesAverage(long[] sales) {

        return getSalesSum(sales) / sales.length;
    }


    public int getMonthSalesMax(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMonthSalesMin(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long getMonthsUnderAverage(long[] sale) {
        long average = getSalesAverage(sale);
        long monthsUnderAverage = 0;

        for (long j : sale) {
            if (j < average) {
                monthsUnderAverage = monthsUnderAverage + 1;
            }
        }
        return monthsUnderAverage;
    }

    public long getMonthsOverAverage(long[] sale) {
        long average = getSalesAverage(sale);
        long monthsOverAverage = 0;

        for (long j : sale) {
            if (j < average) {
                monthsOverAverage = monthsOverAverage + 1;
            }
        }
        return monthsOverAverage;
    }
}
