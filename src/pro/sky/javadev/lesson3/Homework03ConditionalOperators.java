package pro.sky.javadev.lesson3;


public class Homework03ConditionalOperators {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не поддерживается!");
        }
    }

    public static void task2() {
        int clientOs = 1;
        int clientDeviceYear = 2005;

        boolean isLiteVersion = clientDeviceYear < 2015;
        boolean isIos = clientOs == 0;
        boolean isAndroid = clientOs == 1;

        if (isIos) {
            if (isLiteVersion) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (isAndroid) {
            if (isLiteVersion) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Не поддерживается!");
        }
    }

    public static void task3() {
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 101;
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days++;                                 //days= days + 1 == days++
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days++;
        }
        System.out.println("Потребуется дней: " + days);

    }

    public static void task5() {
        int monthNumber = 13;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Не существует");
        }

    }

    public static void task6() {
        int age = 25;
        int salary = 58000;
        int limit;
        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >= 50000 && salary < 80000) {
            limit *= 1.2;
        } else if (salary >= 80000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

    }

    public static void task7() {
        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        int maxPayment = salary / 2;
        int timeCredit = 12;
        int baseRate = 10;
        if (age < 23) {
            baseRate += 1.0;
        } else if (age < 30) {
            baseRate += 0.5;
        }
        if (salary > 80000) {
            baseRate -= 0.7;
        }
        float creditSum = wantedSum * (1 + (baseRate / 100));
        float payment = creditSum / timeCredit;
        System.out.println("Ваш максимальный платеж" + maxPayment + ". Платеж по кредиту: " + payment);
        if (payment < maxPayment) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отказано");
        }
    }

}
