package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Main1 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
//Task1

        int sumMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей.");
//Task2
        int maxSalary = 0;
        int minSalary = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (maxSalary < arr[i]) {
                maxSalary = arr[i];
            } else if (minSalary > arr[i]) {
                minSalary = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей.");
//Task3
        float averageSalary = sumMonth / 30f;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей.");

//Task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
//Task5
        char[][] arr2 = new char[3][3];
        arr2[0][0] = 1;
        arr2[0][2] = 1;
        arr2[1][1] = 1;
        arr2[2][0] = 1;
        arr2[2][2] = 1;
        for (char[] row : arr2) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

//Task6
        int[] arr3 = {5, 4, 3, 2, 1};
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr3));
        for (int r = 0; r < arr3.length; r++) {
            if (arr3[r] != arr4[r]) {
                arr3[r] = arr4[r];
            }
        }
        System.out.println(Arrays.toString(arr3));
//Task7
        int[] arr5 = {7, 9, 11, 37, 9, 4};
        System.out.println(Arrays.toString(arr5));
        int z = arr5.length - 1;
        int x = 0;
        float y = arr5.length / 2f;
        for (int i = 0; y > i; ) {
            if (arr5[i] != arr5[z]) {
                x = arr5[i];
                arr5[i] = arr5[z];
                arr5[z] = x;
            }
            z--;
            i++;
        }
        System.out.println(Arrays.toString(arr5));
//Task8
        int[] arr6 = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};
        Arrays.sort(arr6);
        int m = arr6.length - 1;
        for (int l = 0; m - l > 0; ) {
            if (arr6[l] + arr6[m] != -2) {
                m--;
            } else {
                System.out.println(arr6[l] + " " + arr6[m]);
                m--;
                break;
            }
            if (m - l == 1) {
                m = arr6.length - 1;
                l++;
            }
        }
        System.out.println();
//Task9
        int[] arr7 = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};
        Arrays.sort(arr7);
        int p = arr7.length - 1;
        for (int l = 0; p - l > 0; ) {
            if (arr7[l] + arr7[p] != -2) {
                p--;
            } else {
                System.out.println(arr7[l] + " " + arr7[p]);
                p--;
            }
            if (p - l == 1) {
                p = arr7.length - 1;
                l++;
            }
        }
    }
}
