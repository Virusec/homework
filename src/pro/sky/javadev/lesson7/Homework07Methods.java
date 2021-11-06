package pro.sky.javadev.lesson7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Homework07Methods {
    public static void main(String[] args) {
//        task1
        printIsLeapYear(2122);
//        task2
        printRecommendAppVersion(1, 2021);
//        task3
        System.out.println("Потребуется дней: " + calculateDeliveryDays(49));
//        task4
        findDuplicates("aabccddefgghiijjkk");
//        task5
        int[] data = {3, 2, 1, 6, 5};
        reverseArray(data);
        System.out.println("Reversed array: " + Arrays.toString(data));
//        task6
        int[] array = generateRandomArray();
        System.out.println("Array: " + Arrays.toString(array));
        double avgSum = calculateAverageValueFrom(array);
        System.out.println("Average Sum: " + avgSum);

    }

//        task1();

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

//    task2

    private static void printRecommendAppVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        String deviceType = getDeviceType(clientOS);

        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Установите ");
        if (deviceIsOld) {
            messageBuilder.append("облегченную ");
        }
        messageBuilder.append("версию приложения для ");
        messageBuilder.append(deviceType);

        System.out.println(messageBuilder);
    }

    private static String getDeviceType(int clientOS) {
        if (clientOS == 0) {
            return "iOS по ссылке";
        } else {
            return "Android по ссылке";
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }

//    task3

    public static int calculateDeliveryDays(int deliveryDistance) {
        int days = 1;

        if (deliveryDistance > 20) {
            days++;
        }

        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }

//    task4

    public static void findDuplicates(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("Дублей не найдено");
    }

//    task5

    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }

//    task6

    public static double calculateAverageValueFrom(int[] arr) {
        int sum = calculateSum(arr);
        return calculateAverageValue(sum, arr.length);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static double calculateAverageValue(int sum, int elementAmount) {
        return sum / (double) elementAmount;
    }

    private static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

}
