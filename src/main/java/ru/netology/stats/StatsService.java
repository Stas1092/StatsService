package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {

        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long averageAmount(long[] sales) {

        long average = 0;
        for (long sale : sales) {
            average = average + sale;
        }
        return average / 12;
    }

    public int maxSaleMonth(long[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int minSaleMonth(long[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int bellowAverage = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                bellowAverage++;
            }
        }
        return bellowAverage;
    }

    public int monthsAboveAverage(long[] sales) {
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}



