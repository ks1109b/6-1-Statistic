package ru.netology.stats;

import java.util.ArrayList;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public ArrayList<Integer> monthOfTopSales(long[] sales) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        long topSale = sales[0];
        for (long sale : sales) {
            if (topSale <= sale) {
                topSale = (int) sale;
            }
        }
        for (int month = 0; month < sales.length; month++) {
            if (topSale == sales[month]) {
                result.add(month + 1);
            }
        }
        return result;
    }

    public int monthOfLowSales(long[] sales) {
        long lowSale = sales[0];
        int month = 0;
        int numLowMonth = 0;
        for (long sale : sales) {
            month++;
            if (lowSale > sale) {
                lowSale = (int) sale;
                numLowMonth = month;
            }
        }
        return numLowMonth;
    }

    public int belowAverageMonths(long[] sales) {

        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        long averageSales = sum / sales.length;
        int belowMonth = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                belowMonth ++;
            }
        }
        return belowMonth;
    }

    public int aboveAverageMonths(long[] sales) {

        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        long averageSales = sum / sales.length;
        int aboveMonth = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                aboveMonth ++;
            }
        }
        return aboveMonth;
    }
}