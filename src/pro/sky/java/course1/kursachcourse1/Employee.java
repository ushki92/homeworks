package pro.sky.java.course1.kursachcourse1;

public class Employee {
    private  static int counter;
    private final String name;
    private int department;
    private float salary;
    private final int id;


    @Override
    public String toString() {
        return name + ' ' + department +
                " " + salary +
                " " + id + System.lineSeparator();
    }

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
