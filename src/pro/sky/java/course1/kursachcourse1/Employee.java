package pro.sky.java.course1.kursachcourse1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(name, employee.name);
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
