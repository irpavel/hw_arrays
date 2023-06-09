import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.getSalesSum(sales);
        long average = service.getSalesAverage(sales);
        long salesMax = service.getMonthSalesMax(sales);
        long salesMin = service.getMonthSalesMin(sales);
        long monthUnderAverage = service.getMonthsUnderAverage(sales);
        long monthOverAverage = service.getMonthsOverAverage(sales);

        System.out.println("Продажи за год " + sum);
        System.out.println("В среднем продажи в месяц " + average);
        System.out.println("Месяц максимальных продаж " + salesMax);
        System.out.println("Месяц минимальных продаж " + salesMin);
        System.out.println("Месяцев меньше среднего " + monthUnderAverage);
        System.out.println("Месяцев выше среднего " + monthOverAverage);
    }
}
