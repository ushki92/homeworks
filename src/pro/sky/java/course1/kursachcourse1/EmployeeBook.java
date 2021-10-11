package pro.sky.java.course1.kursachcourse1;

public class EmployeeBook {

    private final Employee[] employees;



    public int counter;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }



    public void printEmployeesByDepartments(int department) {
        StringBuilder print = new StringBuilder("Employees from department " + department + System.lineSeparator());
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                print.append(employee);
                System.out.println(print);
            }
        }
    }

    public void changeEmployeeSalaryByName(String name, int newSalary) {
        int counter1 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                counter1++;
            }
        }
        if (counter1 > 0) {
            for (int i = 0; i < employees.length - 1; i++)
                if (employees[i].getName().equals(name)) {
                    employees[i].setSalary(newSalary);
                    return;
                }
        } else {
                    System.out.println("Not found Employee");
                }

    }

    public void changeEmployeeDepartmentByName(String name, int newDepartment) {
        int counter1 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                counter1++;
            }
        }
        if (counter1 > 0) {
        for (int i = 0; i < employees.length - 1; i++)
            if (employees[i].getName().equals(name)) {
                employees[i].setDepartment(newDepartment);
                return;
            }
        }
        else {
                System.out.println("Not found Employee");
            }
        }


    public void addNewEmployee(Employee employee) {
            if (counter >= employees.length) {
                System.out.println("WARNING NO FREE SPACE");
            } else {
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i] == null) {
                        employees[i] = employee;
                        counter++;
                        return;
                    }
                }
            }
    }

    public void deleteEmployee(Employee employee) {
        int counter1 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee))
            { counter1++; }
        }
        if (counter1 > 0) {
            for (int a = 0; a < employees.length; a++) {
                if (employees[a] != null && employees[a].equals(employee)) {
                    employees[a] = null;
                    counter--;
                }
            }
        } else {
            System.out.println("Not found Employee");
        }
        }

    public void deleteEmployeeName(String name) {
        int b = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                b++;
            }
        }
            if (b > 0) {
        for (int a = 0; a < employees.length - 1; a++)
            if (employees[a] != null && employees[a].getName().equals(name)) {
                employees[a] = null;
            }
    }
        else {
            System.out.println("Not found Employee");
        }
    }

    public void printAllEmployees() {
        StringBuilder print = new StringBuilder("Employees " + System.lineSeparator());
        for (Employee employee : employees) {
            if (employee != null) {
                print.append(employee);
            }
        }
        System.out.println(print);
    }

    public float calculateAllSpendings() {
        float totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return  totalSalary;
    }

    public float calculateAverageSpendings() {
        float totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return  totalSalary / employees.length;
    }

    public Employee findMinSalary() {
        Employee minSalaryEmployee = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if ( minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary == employee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        float maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary == employee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
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

    public void changeAllSalaries(int percent) {
        float newSalary;
        float multiplier = percent/100f;
        for (Employee employee : employees) {
            if (employee != null) {
                newSalary = employee.getSalary() + employee.getSalary() * multiplier;
                employee.setSalary(newSalary);
            }
        }
    }

    public Employee findMinSalaryDepartment(int department) {
        Employee minSalaryDepartmentName = null;
        float minSalary = Float.MAX_VALUE;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && minSalary > employees[i].getSalary() && employees[i].getDepartment() == department) {
                minSalary = employees[i].getSalary();

            }
        }
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && minSalary == employees[i].getSalary() && employees[i].getDepartment() == department) {
                minSalaryDepartmentName = employees[i];
            }

        }
        return minSalaryDepartmentName;
    }

    public Employee findMaxSalaryDepartment(int department) {
        Employee maxSalaryDepartmentName = null;
        float maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary() && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();

            }
        }
        for (Employee employee : employees) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                maxSalaryDepartmentName = employee;
            }

        }
        return maxSalaryDepartmentName;
    }

    public float calculateDepartmentSalarySpendings(int department) {
        float totalSpendings = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSpendings += employee.getSalary();
            }
        }
        return totalSpendings;
    }
    public float calculateDepartmentAverageSalarySpendings (int department) {
        float totalSalary = 0;
        float counter = 0;
        for (Employee employee : employees) {
            if (employee != null &&employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                counter++;
            }
        }
        return totalSalary/counter;
    }
    public void changeDepartmentSalaries(int percent, int department) {
        float newSalary;
        float multiplier = percent/100f;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                newSalary = employee.getSalary() + employee.getSalary() * multiplier;
                employee.setSalary(newSalary);
            }
        }
    }
    public void printEmployeesWithSalaryToValueLess(float value) {
        StringBuilder employeeLessToValue = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null && value > employee.getSalary()) {
                employeeLessToValue.append(employee);
            }
        }
        System.out.println(employeeLessToValue);
    }
    public void printEmployeesWithSalaryToValueMoreOrEqual(float value) {
        StringBuilder employeeMoreToValue = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null && value <= employee.getSalary()) {
                employeeMoreToValue.append(employee);
            }
        }
        System.out.println(employeeMoreToValue);
    }
}
