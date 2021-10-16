package pro.sky.javadev.lesson2;

public class Homework02Variables {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte b = 125;
        short d = 30000;
        int r = 51234568;
        long s = 1234567890L;
        float g = 1.289f;
        double k = 654.6187331;
        char m = 563;
        boolean book = true;
    }

    public static void task2() {
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float amountWeight = (boxerWeight1 + boxerWeight2);
        float differenceWeight = (boxerWeight1 - boxerWeight2);
        System.out.println("Общий вес двух бойцов " + amountWeight + "кг");
        System.out.println("Разница между весами бойцов " + Math.abs(differenceWeight) + "кг");
    }

    public static void task3() {
        int bananasWeight = 80;
        int bananasAmount = 5;
        int milksWeight = 105;
        int milksAmount = 2;
        int iceCreamsWeight = 100;
        int iceCreamsAmount = 2;
        int eggsWeight = 70;
        int eggsAmount = 4;
        int gramsInKg = 1000;
        float breakfastAmount = (((bananasAmount * bananasWeight)
                + (milksAmount * milksWeight)
                + (iceCreamsAmount * iceCreamsWeight)
                + (eggsAmount * eggsWeight)) * 1.0f);
        System.out.println(" Вес завтрака спортсмена " + breakfastAmount / gramsInKg + " кг ");
    }

    public static void task4() {
        int goalLoseWeight = 7;
        int gramsInKg = 1000;
        int loseWeight1 = 250;
        int loseWeight2 = 500;
        int goalLoseWeightGrams = (goalLoseWeight * gramsInKg);
        int daysBeforeTheGoalsMin = (goalLoseWeightGrams / loseWeight2);
        int daysBeforeTheGoalsMax = (goalLoseWeightGrams / loseWeight1);
        int daysBeforeTheGoalsAverage = ((daysBeforeTheGoalsMax + daysBeforeTheGoalsMin) / 2);
        System.out.println("Минимум " + daysBeforeTheGoalsMin + " дней");
        System.out.println("Максимум " + daysBeforeTheGoalsMax + " дней");
        System.out.println("В среднем " + daysBeforeTheGoalsAverage + " день");
    }

    public static void task5() {
        int increaseSalaryPercent = 10;
        float increaseSalaryRatio = (1 + (increaseSalaryPercent / 100f));
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMashaYear = (int) (salaryMasha * increaseSalaryRatio * 12);
        int newSalaryDenisYear = (int) (salaryDenis * increaseSalaryRatio * 12);
        int newSalaryKristinaYear = (int) (salaryKristina * increaseSalaryRatio * 12);
        int previousSalaryMashaYear = (salaryMasha * 12);
        int previousSalaryDenisYear = (salaryDenis * 12);
        int previousSalaryKristinaYear = (salaryKristina * 12);
        int differenceMasha = (newSalaryMashaYear - previousSalaryMashaYear);
        int differenceDenis = (newSalaryDenisYear - previousSalaryDenisYear);
        int differenceKristina = (newSalaryKristinaYear - previousSalaryKristinaYear);
        System.out.println("Маша теперь получает " + newSalaryMashaYear + " рублей. " +
                "Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenisYear + " рублей. " +
                "Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristinaYear + " рублей. " +
                "Годовой доход вырос на " + differenceKristina + " рублей");
    }

    public static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
//        int result = (a*(b+(c-d*e))) * -1;
        int result = (a * (b + (c - d * e)));
        System.out.println(-result);
    }

    public static void task7() {
        int a = 5;
        int b = 7;
        System.out.println("a = " + a + " b = " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void task8() {
        int a = -698;
        int b = a / 10;
        b = b % 10;
        System.out.println(Math.abs(b));
    }
}
