import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int sum = service.getSalesSum(sales);
        int average = service.getSalesAverage(sales);
        int salesMax = service.getMonthSalesMax(sales);
        int salesMin = service.getMonthSalesMin(sales);
        int monthUnderAverage = service.getMonthsUnderAverage(sales);
        int monthOverAverage = service.getMonthsOverAverage(sales);

        System.out.println("Продажи за год " + sum);
        System.out.println("В среднем продажи в месяц " + average);
        System.out.println("Месяц максимальных продаж " + salesMax);
        System.out.println("Месяц минимальных продаж " + salesMin);
        System.out.println("Месяцев меньше среднего " + monthUnderAverage);
        System.out.println("Месяцев выше среднего " + monthOverAverage);
    }
}
