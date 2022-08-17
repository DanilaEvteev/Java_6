package ru.netology.stats;

public class StatsService {
    public long findSumma(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = sale + result;
        }
        return result;
    }
    public long findAverage(long[] sales) {
        long result = findSumma(sales) / sales.length;
        return result;
    }

    public int findMax(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMin(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) {
        long average = findAverage(sales);
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                result++;
            }
        }
        return result;
    }

    public int overAverage(long[] sales) {
        long average = findAverage(sales);
        int result = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] < average) {
                result++;
            }
        }
        return result;
    }
}

