package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public long calculateAvgSum(long[] sales) {
        long sum=calculateSum(sales);
        long monthQuantity=0;
        long avgSum=0;
        for (long sale : sales) {
            monthQuantity=monthQuantity+1;
        }
        avgSum=sum/monthQuantity;
        return avgSum;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
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
    public long monthQuantitySalesBelowAverage(long[] sales) {
        long avgSum = calculateAvgSum(sales);
        long monthQuantitySalesBelowAverage = 0;
        for (long sale : sales) {
            if (sale < avgSum) {
                monthQuantitySalesBelowAverage = monthQuantitySalesBelowAverage + 1;
            }
        }
        return monthQuantitySalesBelowAverage;
    }
    public long monthQuantitySalesAboveAverage(long[] sales) {
        long avgSum = calculateAvgSum(sales);
        long monthQuantitySalesAboveAverage = 0;
        for (long sale : sales) {
            if (sale < avgSum) {
                monthQuantitySalesAboveAverage = monthQuantitySalesAboveAverage + 1;
            }
        }
        return monthQuantitySalesAboveAverage;
    }
}