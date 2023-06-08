package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int getSalesSum(int[] sales) {

        return Arrays.stream(sales).sum();
    }

    public int getSalesAverage(int[] sales) {

        return getSalesSum(sales) / sales.length;
    }


    public int getMonthSalesMax(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMonthSalesMin(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMonthsUnderAverage(int[] sale) {
        int average = getSalesAverage(sale);
        int monthsUnderAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                monthsUnderAverage = monthsUnderAverage + 1;
            }
        }
        return monthsUnderAverage;
    }

    public int getMonthsOverAverage(int[] sale) {
        int average = getSalesAverage(sale);
        int monthsOverAverage = 0;

        for (int i = 0; i < sale.length; i++) {

            if (sale[i] < average) {
                monthsOverAverage = monthsOverAverage + 1;
            }
        }
        return monthsOverAverage;
    }
}
