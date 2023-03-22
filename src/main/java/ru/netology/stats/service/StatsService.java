package ru.netology.stats.service;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int sum = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int belowTheAverageValue(long[] sales) {
        long minAverage = averageSumSales(sales);
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minAverage) {
                value++;
            }
        }
        return value;
    }

    public int aboveTheAverageValue(long[] sales) {
        long minAverage = averageSumSales(sales);
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > minAverage) {
                value++;
            }
        }
        return value;
    }
}