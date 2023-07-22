package ru.netology.stats;

import java.util.ArrayList;

public class StatsService {
    //    сумму всех продаж;
    public static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    //    среднюю сумму продаж в месяц;
    public static int avg(int[] arr) {
        int sum = sum(arr);
        return sum / arr.length;
    }

    //    номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public static int highest(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[res - 1]) {
                res = i + 1;
            }
        }
        return res;
    }

    //    номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    public static int lowest(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[res - 1]) {
                res = i + 1;
            }
        }
        return res;
    }

    //    количество месяцев, в которых продажи были ниже среднего (см. п.2);

    public static int[] lowestAvgList(int[] arr) {
        int avg = avg(arr);
        int arrCounter = 0;
        for (int number : arr) {
            if (number < avg) {
                arrCounter++;
            }
        }
        int[] res = new int[arrCounter];
        arrCounter = 0;
        for (int number : arr) {
            if (number < avg) {
                res[arrCounter] = number;
                arrCounter++;
            }
        }
        return res;
    }

    //    количество месяцев, в которых продажи были выше среднего (см. п.2).
    public static int[] highestAvgList(int[] arr) {
        int avg = avg(arr);
        int arrCounter = 0;
        for (int number : arr) {
            if (number > avg) {
                arrCounter++;
            }
        }
        int[] res = new int[arrCounter];
        arrCounter = 0;
        for (int number : arr) {
            if (number > avg) {
                res[arrCounter] = number;
                arrCounter++;
            }
        }
        return res;
    }
}
