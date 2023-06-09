public class Main {
    private static final Employee[] EMPLOYEE = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEE[0] = new Employee("Borisov Kot Felixovich", 41_300, 2);
        EMPLOYEE[1] = new Employee("Burina Larisa Ivanovna", 45_200, 5);
        EMPLOYEE[2] = new Employee("Gridin Nikita Mihailovich", 33_348, 1);
        EMPLOYEE[3] = new Employee("Petrov Grigori Sergeevich", 35_000, 4);
        EMPLOYEE[4] = new Employee("Pupkin Vasili Vasilievich", 23_452, 3);
        EMPLOYEE[5] = new Employee("Dolmatov Petr Alekseevich", 31_235, 1);
        EMPLOYEE[6] = new Employee("Bychkov Nikolay Sergeevich", 52_234, 5);
        EMPLOYEE[7] = new Employee("Darov Vasili Becheslavovich", 31_500, 3);
        EMPLOYEE[8] = new Employee("Pushkin Mikhail Nikolaevich", 40_500, 2);
        EMPLOYEE[9] = new Employee("Danshenko Anna Aleksandrovna", 72_000, 4);

        printInfo();
        System.out.println("Total salary cost: " + sum());
        System.out.println("Average salary: " + averageWage());
        System.out.println("Employee with lowest salary : " + minWage());
        System.out.println("Employee with highest salary : " + maxWage());
        printFullName();

    }

    private static void printInfo() {
        for (Employee employee : EMPLOYEE) {
            System.out.println(employee);
        }
    }

    private static int sum() {
        int sum = 0;
        for (Employee employee : EMPLOYEE) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static String minWage() {
        Employee employee = null;
        int minWage = Integer.MAX_VALUE;
        for (Employee employee1 : EMPLOYEE) {
            if (employee1.getSalary() < minWage) {
                minWage = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee.getFullName() + "; Salary: " + employee.getSalary();

    }

    private static String maxWage() {
        Employee employee = null;
        int maxWage = Integer.MIN_VALUE;
        for (Employee employee1 : EMPLOYEE) {
            if (employee1.getSalary() > maxWage) {
                maxWage = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee.getFullName() + "; Salary: " + employee.getSalary();
    }

    private static double averageWage() {
        return sum() / (double) EMPLOYEE.length;
    }

    private static void printFullName() {
        for (Employee employee : EMPLOYEE) {
            System.out.println(employee.getFullName());
        }
    }

}