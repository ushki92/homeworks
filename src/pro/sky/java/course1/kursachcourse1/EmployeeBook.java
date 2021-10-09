package pro.sky.java.course1.kursachcourse1;

import java.util.Arrays;

public class EmployeeBook {

    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return Arrays.equals(employees, that.employees);
    }

    public void printEmployeesByDepartments(int department) {
        StringBuilder print = new StringBuilder("Employees from department " + department + System.lineSeparator());
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                print.append(employee.getName()).append(" ").append(" ").append(employee.getSalary()).append(" ").append(employee.getId()).append(System.lineSeparator());
            }
        }
        System.out.println(print);
    }

    public void changeEmployeeSalaryByName(String name, int newSalary) {
        for (int i = 0; i < employees.length - 1; i++)
            if (employees[i].getName().equals(name)) {
                employees[i].setSalary(newSalary);
                return;
            }
    }
    public void changeEmployeeDepartmentByName(String name, int newDepartment) {
        for (int i = 0; i < employees.length - 1; i++)
            if (employees[i].getName().equals(name)) {
                employees[i].setDepartment(newDepartment);
                return;
            }

    }


    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;
            }
        }
    }

    public void deleteEmployeeName(String name) {
        for (int i = 0; i < employees.length - 1; i++)
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
            }
    }
    public void printAllEmployees() {
        StringBuilder print = new StringBuilder("Employees " + System.lineSeparator());
        for (Employee employee : employees) {
            if (employee != null) {
                print.append(employee.getName()).append(" ").append(employee.getDepartment()).append(" ").append(employee.getSalary()).append(" ").append(employee.getId()).append(System.lineSeparator());
            }
        }
        System.out.println(print);
    }

    public int calculateAllSpendings() {
        float a = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                a = a + employee.getSalary();
            }
        }
        return (int) a;
    }

    public int averageSpendings() {
        float a = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                a = a + employee.getSalary();
            }
        }
        return (int) (a / employees.length);
    }

    public String minSalary() {
        StringBuilder a = new StringBuilder();
        float b = 100_000_000;
        for (Employee employee : employees) {
            if (employee != null) {
                if (b > employee.getSalary()) {
                    b = employee.getSalary();
                }
            }
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (b == employee.getSalary()) {
                    a.append(employee.getName()).append(" ").append(employee.getDepartment()).append(" ").append(employee.getSalary()).append(System.lineSeparator());
                }
            }
        }
        return a.toString();
    }

    public String maxSalary() {
        StringBuilder a = new StringBuilder();
        float b = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (b < employee.getSalary()) {
                    b = employee.getSalary();
                }
            }
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (b == employee.getSalary()) {
                    a.append(employee.getName()).append(" ").append(employee.getDepartment()).append(" ").append(employee.getSalary()).append(System.lineSeparator());
                }
            }
        }
        return a.toString();
    }

    public void printAllEmployeesNames() {
        StringBuilder print = new StringBuilder("Employees Names " + System.lineSeparator());
        for (Employee employee : employees) {
            if (employee != null) {
                print.append(employee.getName()).append(System.lineSeparator());
            }
        }
        System.out.println(print);
    }

    public void changeAllSalaries(float incr) {
        float a;
        for (Employee employee : employees) {
            if (employee != null) {
                a = employee.getSalary() + employee.getSalary() * (incr / 100);
                employee.setSalary(a);
            }
        }
    }

    public String minSalaryDepartment(int department) {
        StringBuilder a = new StringBuilder();
        float b = 100_000_000;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && b > employees[i].getSalary() && employees[i].getDepartment() == department) {
                b = employees[i].getSalary();

            }
        }
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && b == employees[i].getSalary() && employees[i].getDepartment() == department) {
                a.append(employees[i].getName()).append(" ").append(employees[i].getSalary()).append(System.lineSeparator());
            }

        }
        return a.toString();
    }

    public String maxSalaryDepartment(int department) {
        StringBuilder a = new StringBuilder();
        float b = 0;
        for (Employee employee : employees) {
            if (employee != null && b < employee.getSalary() && employee.getDepartment() == department) {
                b = employee.getSalary();

            }
        }
        for (Employee employee : employees) {
            if (employee != null && b == employee.getSalary() && employee.getDepartment() == department) {
                a.append(employee.getName()).append(" ").append(employee.getSalary()).append(System.lineSeparator());
            }

        }
        return a.toString();
    }

    public float departmentSalarySpendings(int department) {
        float b = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                b = b + employee.getSalary();
            }
        }
        return b;
    }
    public float departmentAverageSalarySpendings (int department) {
        float b = 0;
        float c = 0;
        for (Employee employee : employees) {
            if (employee != null &&employee.getDepartment() == department) {
                b = b + employee.getSalary();
                c++;
            }
        }
        return b/c;
    }
    public void changeDepartmentSalaries(float incr, int department) {
        float a;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                a = employee.getSalary() + employee.getSalary() * (incr / 100);
                employee.setSalary(a);
            }
        }
    }
    public String salaryToValueLess(float value) {
        StringBuilder a = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null &&value > employee.getSalary()) {
                a.append(employee.getName()).append(" ").append(employee.getSalary()).append(employee.getId()).append(System.lineSeparator());
            }
        }
        return a.toString();
    }
    public String salaryToValueMoreOrEqual(float value) {
        StringBuilder a = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null && value <= employee.getSalary()) {
                a.append(employee.getName()).append(" ").append(employee.getSalary()).append(employee.getId()).append(System.lineSeparator());
            }
        }
        return a.toString();
    }
}
