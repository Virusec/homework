package pro.sky.javadev.coursework;

public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        addEmployee("Андреев Андрей Андреевич", 1, 60000);
        addEmployee("Борисов Борис Борисович", 1, 55000);
        addEmployee("Васильев Василий Васильевич", 2, 50000);
        addEmployee("Гамидов Гасан Гасанович", 2, 70000);
        addEmployee("Денисов Денис Денисович", 3, 65000);
        addEmployee("Елисеев Евгений Евгеньевич", 3, 300000);
        addEmployee("Ильин Илья Николаевич", 4, 15000);
        addEmployee("Климов Алексей Петрович", 4, 40000);
        addEmployee("Николаев Арсений Львович", 5, 40000);
        addEmployee("Максимов Максим Максимович", 5, 35000);


        System.out.println("Вся доступная информация о сотрудниках: ");
        getAllStaffInfo();
        System.out.println();

        float salarySum = getSalarySum();
        System.out.println("Сумма затрат на зарплаты: " + salarySum);
        System.out.println();

        String nameMaxSalary = getMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + nameMaxSalary);
        System.out.println();

        String nameMinSalary = getMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + nameMinSalary);
        System.out.println();

        float averageSalary = getAverageSalary();
        System.out.println("Средняя зарплата сотрудника: " + averageSalary);
        System.out.println();

        System.out.println("ФИО всех сотрудников: ");
        printEmployeeName();
        System.out.println();


    }

    public static void addEmployee(String employeeName, int department, int salary) {
        if (employees[employees.length - 1] != null) {
            System.out.println("Employee book is full. Adding a new employee  is restricted.");
        }
        Employee new_employee = new Employee(employeeName, department, salary);
        for (int i = 0; i < employees.length; i++)
            if (employees[i] == null) {
                employees[i] = new_employee;
                break;
            }
    }

    public static void getAllStaffInfo() {
        for (int i = 0; i < employees.length; i++) {
            String str = employees[i].toString();
            System.out.println(str);
        }
    }

    public static float getSalarySum() {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum;
    }

    private static String getMaxSalary() {
        float maxSalary = 0;
        String nameMaxSalary = employees[0].getEmployeeName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                nameMaxSalary = employees[i].getEmployeeName();
            }
        }
        return nameMaxSalary;
    }

    private static String getMinSalary() {
        float minSalary = employees[0].getSalary();
        String nameMinSalary = employees[0].getEmployeeName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                nameMinSalary = employees[i].getEmployeeName();
            }
        }
        return nameMinSalary;
    }

    private static float getAverageSalary() {
        float salarySum = getSalarySum();
        return salarySum / employees.length;
    }

    private static void printEmployeeName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
    }
}
