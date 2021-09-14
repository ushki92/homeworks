package pro.sky.java.course1.lesson7;

import java.time.LocalDate;
import java.util.Arrays;

public class lesson7 {
    public static void main(String[] args) {
        //Task1
        int year = 2001;
        calculateYearAndPrint(year);
        //Task2
        int clientOS = 1;
        int clientDeviceYear = 2021;
        checkDeviceVersionRecomendationsAndPrint(clientOS, clientDeviceYear);
        //Task3
        int deliveryDistance = 10;
        int calculateDeliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Доставка займет " + calculateDeliveryDays);
        //Task4
        String taskFour = "bc";
        stringCheckForDoubles(taskFour);
        //Task5
        int[] arr5 = {7, 9, 11, 37, 9, 4};
        reverseArray(arr5);
        System.out.println(Arrays.toString(arr5));
        //Task6
        int[] arr = generateRandomArray();
        int sumMonth = calculateSumMonth(arr);
        calculateAverageDaySpentAndPrint(sumMonth, arr.length);
    }

    public static int calculateSumMonth(int[] a) {
        int sumMonth = 0;
        for (int j : a) {
            sumMonth += j;
        }
        return sumMonth;
    }

    public static void calculateAverageDaySpentAndPrint(int a, int b) {
        float averageDaySpent;
        averageDaySpent = a / b;
        System.out.println("Средняя трата за один день " + averageDaySpent);

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void reverseArray(int[] a) {
        int z = a.length - 1;
        int x;
        float y = a.length / 2f;
        for (int i = 0; y > i; ) {
            if (a[i] != a[z]) {
                x = a[i];
                a[i] = a[z];
                a[z] = x;
            }
            z--;
            i++;
        }
    }

    private static void stringCheckForDoubles(String arr) {
        char[] arrBuild = arr.toCharArray();
        Arrays.sort(arrBuild);
        for (int i = 0; i < arrBuild.length - 1; i++) {
            if (arrBuild[i] == arrBuild[i + 1]) {
                System.out.println("Найден дубль " + arrBuild[i]);
                break;
            } else {
                System.out.println("Дублей не найдено");
            }
        }

    }

    private static int calculateDeliveryDays(int a) {
        int calculateDeliveryDays = 0;
        if (a < 20) {
            calculateDeliveryDays += 1;
        } else if (a < 60) {
            calculateDeliveryDays += 2;
        } else {
            calculateDeliveryDays += 3;
        }
        return calculateDeliveryDays;
    }

    private static void checkDeviceVersionRecomendationsAndPrint(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 1 && b < currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (a == 0 && b < currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (b == currentYear && a == 0) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        }
        if (b == currentYear && a == 1) {
            System.out.println("Установите lite-версию приложения для IOS по ссылке");
        }
    }

    private static void calculateYearAndPrint(int a) {
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }
}


