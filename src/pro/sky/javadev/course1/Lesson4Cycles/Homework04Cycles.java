package pro.sky.javadev.course1.Lesson4Cycles;

public class Homework04Cycles {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int num = 1;
        while (num <= 10) {
            if (num == 10) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
            num++;

        }
        for (int i = 10; i > 0; i--) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "ое число. " + "Необходимо подготовить отчет.");
        }

    }

    public static void task3() {
        int Year = 2021;
        int begin = Year - 200;
        int end = Year + 100;
        for (int a = begin; a < end; a++) {
            if (a % 79 == 0) {
                System.out.println(a);
            }
        }

    }

    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");

            if (i % 3 == 0) {
                System.out.print("ping" + " ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
    }

    public static void task5() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;
        }

    }
}
