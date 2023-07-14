package ru.netology.stats;

import java.util.ArrayList;
import java.util.Arrays;

public class StatsService {
//    сумму всех продаж;
    public static int sum(int[] arr) {
        return (int) (Arrays.stream(arr).sum());
    }
//    среднюю сумму продаж в месяц;
    public static int avg(int[] arr) {
        return (int) (Arrays.stream(arr).sum()/arr.length);
    }
//    номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public static int highest(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[res-1]) {
                res = i+1;
            }
        }
        return res;
    }
//    номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    public static int lowest(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[res-1]) {
                res = i+1;
            }
        }
        return res;
    }
//    количество месяцев, в которых продажи были ниже среднего (см. п.2);
    public static ArrayList<Integer> lowestAvgList(int[] arr, int avg) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                res.add(arr[i]);
            }
        }
        return res;
    }
//    количество месяцев, в которых продажи были выше среднего (см. п.2).
    public static ArrayList<Integer> highestAvgList(int[] arr, int avg) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                res.add(arr[i]);
            }
        }
        return res;
    }
}
