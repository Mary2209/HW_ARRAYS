package ru.netology.stats;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = StatsService.sum(sales);
        System.out.println(sum);

        int avg = StatsService.avg(sales);
        System.out.println(avg);

        int highest = StatsService.highest(sales);
        System.out.println(highest);

        int lowest = StatsService.lowest(sales);
        System.out.println(lowest);

        ArrayList<Integer> lowestAvgList = StatsService.lowestAvgList(sales, avg);
        System.out.println(lowestAvgList.toString());

        ArrayList<Integer> highestAvgList = StatsService.highestAvgList(sales, avg);
        System.out.println(highestAvgList.toString());
    }
}