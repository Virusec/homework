package pro.sky.javadev.lesson5;

import java.util.Arrays;

public class Homework05Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }


    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / (double) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }

    public static void task5() {
        int[][] matrix = new int[3][3];
//      1 0 1
//      0 1 0
//      1 0 1
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

    }

    public static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static void task7() {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int s = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = s;
        }
//        OR
//        int leftIndex = 0;
//        int rightIndex = arr.length -1;
//        while (leftIndex < rightIndex) {
//            int temp = arr[leftIndex];
//            arr[leftIndex++] = arr[rightIndex];
//            arr[rightIndex--] = temp;
//
//        }
        System.out.println(Arrays.toString(arr));

    }

    public static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int lostNumber = -2;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            if (sum == lostNumber) {
                System.out.println(arr[leftIndex] + " и " + arr[rightIndex]);
                break;
            } else if (sum > lostNumber) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }


    }

    public static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int lostNumber = -2;
        Arrays.sort(arr);
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            if (sum == lostNumber) {
                System.out.println(arr[leftIndex++] + " и " + arr[rightIndex--]);

            } else if (sum > lostNumber) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

    }


}