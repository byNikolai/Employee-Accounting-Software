public class Employee {
    private String fullName;
    private int salary;
    private int employeeDepartment;
    private int id;
    private static int idCounter;

    public Employee(String fullName, int salary, int employeeDepartment) {
        this.fullName = fullName;
        this.salary = salary;
        this.employeeDepartment = employeeDepartment;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "id: " + id + " Employee: " + fullName + ";" + " Department: " + employeeDepartment + ";" + " Salary: " + salary + ";";
    }
}
