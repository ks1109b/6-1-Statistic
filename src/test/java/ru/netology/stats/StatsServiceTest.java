package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class StatsServiceTest {

    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.sumSales(sales);

        System.out.println(sum);
    }

    @Test
    void shouldAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = service.averageSales(sales);

        System.out.println(average);
    }

    @Test
    void shouldFindTopMonth() {
        StatsService service = new StatsService();
        ArrayList<Integer> topMonth;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        topMonth = service.monthOfTopSales(sales);

        System.out.println(topMonth);
    }

    @Test
    void shouldFindLowMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long lowMonth = service.monthOfLowSales(sales);

        System.out.println(lowMonth);
    }

    @Test
    void shouldBelowAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long belowMonths = service.belowAverageMonths(sales);

        System.out.println(belowMonths);
    }

    @Test
    void shouldAboveAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long aboveMonth = service.aboveAverageMonths(sales);

        System.out.println(aboveMonth);
    }
}