import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Employee {
    private final String employeeInitials;
    private int employeeSalary;
    private int employeeDepartment;
    private static int counter;
    private final int id;

    public Employee(String employeeInitials, int employeeSalary, int employeeDepartment, int id) {
        this.employeeInitials = employeeInitials;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
        this.id = ++counter;
    }

    public String getEmployeeInitials() {
        return employeeInitials;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника: " + employeeInitials + "; Номер отдела: " + employeeDepartment + "; Заработная плата: " + employeeSalary + ";";
    }

    public static int sum(Employee[] array) {
        int sum = 0;
        ArrayList<Float> salary = new ArrayList<Float>();
        for (Employee value : array) {
            sum += value.getEmployeeSalary();
        }
        return sum;
    }

    public static Employee minWage(Employee[] array) {
        int sum = 0;
        ArrayList<Float> salary = new ArrayList<Float>();
        for (Employee value : array) {
            sum += value.getEmployeeSalary();
            salary.add(value.getEmployeeSalary());
        } return array[salary.indexOf(Collections.min(salary))];

    }
    public static Employee maxWage(Employee[] array) {
        int sum = 0;
        ArrayList<Float> salary = new ArrayList<Float>();
        for (Employee value : array) {
            sum += value.getEmployeeSalary();
            salary.add(value.getEmployeeSalary());
        } return array[salary.indexOf(Collections.max(salary))];

    }

    public static Employee initials(Employee[] array) {
        int sum = 0;
        ArrayList<String> initials = new ArrayList<String>();
        for (Employee value : array) {
            sum += value.getEmployeeSalary();
            initials.add(value.getEmployeeInitials());
        } return array[initials.indexOf(initials)];

    }
    public static double average(Employee[] array) {
        double average = sum(array);
        return average / array.length;
    }



    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Borisov Kot Felixovich", 41_300, 2, counter);
        employee[1] = new Employee("Burina Larisa Ivanovna", 45_200, 5, counter);
        employee[2] = new Employee("Gridin Nikita Mihailovich", 33_348, 1, counter);
        employee[3] = new Employee("Petrov Grigori Sergeevich", 35_000, 4, counter);
        employee[4] = new Employee("Pupkin Vasili Vasilievich", 23_452, 3, counter);
        employee[5] = new Employee("Dolmatov Petr Alekseevich", 31_235, 1, counter);
        employee[6] = new Employee("Bychkov Nikolay Sergeevich", 52_234, 5, counter);
        employee[7] = new Employee("Darov Vasili Becheslavovich", 31_500, 3, counter);
        employee[8] = new Employee("Pushkin Mikhail Nikolaevich", 40_500, 2, counter);
        employee[9] = new Employee("Danshenko Anna Aleksandrovna", 72_000, 4, counter);
        int sum = 0;
        ArrayList<Float> salary = new ArrayList<Float>();
        ArrayList<String> initials = new ArrayList<String>();

        for (Employee value : employee) {
            sum += value.getEmployeeSalary();
            salary.add(value.getEmployeeSalary());
            initials.add(value.getEmployeeInitials());
        }
        System.out.println("Вся информация через toString: " + Arrays.toString(employee));
        System.out.println("Общая сумма затрат на зарплаты в месяц: " + sum(employee));
        System.out.println("Минимальную зарплату получает: " + minWage(employee));
        System.out.println("Максимальную зарплату получает: " + maxWage(employee));
        System.out.println("Средняя зарпата работников : " + average(employee));
        System.out.println("Инициалы всех работников: " + initials);
    }

}
