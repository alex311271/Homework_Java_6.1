import ru.netology.homework.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {100, 500, 500, 800, 1010, 15, 370, 550, 999, 103, 1000, 1};
        System.out.println(service.sumSales(sales));
        System.out.println(service.averageMonthlySales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.monthMaxSales(sales));
        System.out.println(service.monthMinSales(sales));
    }
}
