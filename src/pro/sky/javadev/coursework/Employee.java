package pro.sky.javadev.coursework;

public class Employee {
    private static int idCounter = 0;
    private final String employeeName;
    private final int id;
    private int department;
    private int salary;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = idCounter;
        idCounter++;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Invalid department " + department);
            return;
        }
        this.department = department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "; ФИО: " + employeeName + "; Департамент: " + department + "; Зарплата: " + salary;
    }
}
