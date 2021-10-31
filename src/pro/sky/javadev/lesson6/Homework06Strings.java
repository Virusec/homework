package pro.sky.javadev.lesson6;

public class Homework06Strings {
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
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
//        String fullName = lastName + " " + firstName + " " + middleName;
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ", ";"));
    }

    public static void task4() {
        String fullName = "Иванов Семен Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            if (Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
                words[i] = new String(chars);
            }
        }
        String toUpperletter = String.join(" ", words);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + toUpperletter);
    }

    public static void task7() {
        String a = "135";
        String b = "246";
        StringBuilder sb = new StringBuilder();
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        System.out.println("Данные строки — " + sb);
    }

    public static void task8() {
        String s = "aabccddefgghiijjkk";
        char prevChar = Character.MAX_VALUE;
        boolean isDuplicateFound = false;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char letter : chars) {
            if (letter != prevChar) {
                isDuplicateFound = false;
            } else if (isDuplicateFound) {
                continue;
            } else {
                sb.append(letter);
                isDuplicateFound = true;
            }
            prevChar = letter;
        }
        System.out.println(sb);
    }

}
