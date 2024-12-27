package ru.netology.statistic;


public class Main {
    public static void main(String[] args) {

        StatisticsService service = new StatisticsService();
        long[] arr = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        service.findMax(arr);
    }
}