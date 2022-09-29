package ru.netology.homework.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long averageMonthlySales(long[] sales) {
        long sum = sumSales(sales);
        long avgSum = sum / sales.length;
        return avgSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthMaxSales(long[]sales) {
        long avgSum = averageMonthlySales(sales);
        int sumMont = 0;
        for (long sale : sales) {
            if (sale > avgSum) {
                sumMont = sumMont +1;
            }
        }
        return sumMont;
    }

    public int monthMinSales(long[]sales) {
        long avgSum = averageMonthlySales(sales);
        int sumMont = 0;
        for (long sale : sales) {
            if (sale < avgSum) {
                sumMont = sumMont + 1;
            }
        }
        return sumMont;
    }

}
