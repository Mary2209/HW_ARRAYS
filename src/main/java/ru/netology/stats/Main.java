package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = StatsService.sum(sales);
        System.out.println(sum);

        int avg = StatsService.avg(sales, sum);
        System.out.println(avg);

        int highest = StatsService.highest(sales);
        System.out.println(highest);

        int lowest = StatsService.lowest(sales);
        System.out.println(lowest);

        int[] lowestAvgList = StatsService.lowestAvgList(sales, avg);
        System.out.println(Arrays.toString(lowestAvgList));

        int[] highestAvgList = StatsService.highestAvgList(sales, avg);
        System.out.println(Arrays.toString(highestAvgList));
    }
}