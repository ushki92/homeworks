package pro.sky.java.course1.kursachcourse1;



public class KursachCourse1 {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        Employee employee1 = new Employee("Ivan Ivanovich Ivanov ", 1, 100000);
        Employee employee2 = new Employee("Sergey Sergeevich Sergeev", 2, 10000);
        Employee employee3 = new Employee("Uiriy Uirevuch Uiriev", 3, 100002);
        Employee employee4 = new Employee("Anna Ivanovna Ivanova", 1, 10000);
        Employee employee5 = new Employee("Anna Ivanovna Ivanova", 1, 1000);
        Employee employee6 = new Employee("Anna Ivanovna Ivanova", 1, 100);
        Employee employee7 = new Employee("Uiriy Sergeevich Sergeev", 4, 100007);
        Employee employee8 = new Employee("Genadziy Sergeevich Sergeev", 1, 100);
        Employee employee9 = new Employee("Genadziy Uirevuch Petrov", 1, 10);
        Employee employee10 = new Employee("Genadziy Sergeevich Petrov", 1, 110);
        employeeBook.addNewEmployee(employee1);
        employeeBook.addNewEmployee(employee2);
        employeeBook.addNewEmployee(employee3);
        employeeBook.addNewEmployee(employee4);
        employeeBook.addNewEmployee(employee5);
        employeeBook.addNewEmployee(employee6);
        employeeBook.addNewEmployee(employee7);
        employeeBook.addNewEmployee(employee8);
        employeeBook.addNewEmployee(employee9);
        employeeBook.addNewEmployee(employee10);

        employeeBook.printEmployeesByDepartments(2);
        employeeBook.changeEmployeeSalaryByName(employee9.getName(), 12345);
        employeeBook.changeEmployeeDepartmentByName(employee10.getName(), 2);
        employeeBook.deleteEmployee(employee5);
        employeeBook.deleteEmployee(employee5);
        employeeBook.deleteEmployeeName(employee6.getName());
        employeeBook.deleteEmployeeName(employee6.getName());
        employeeBook.printAllEmployees();
        System.out.println(employeeBook.calculateAllSpendings());
        System.out.println(employeeBook.calculateAverageSpendings());
        employeeBook.printAllEmployeesNames();
        employeeBook.changeAllSalaries(10);
        System.out.println(employeeBook.findMinSalaryDepartment(1).toString());
        System.out.println(employeeBook.findMaxSalaryDepartment(1).toString());
        System.out.println(employeeBook.calculateDepartmentSalarySpendings(1));
        System.out.println(employeeBook.calculateDepartmentAverageSalarySpendings(1));
        employeeBook.changeDepartmentSalaries(100,1);
        employeeBook.printEmployeesWithSalaryToValueLess(100000);
        employeeBook.printEmployeesWithSalaryToValueMoreOrEqual(100000);
        employeeBook.printAllEmployeesNames();
        employeeBook.printAllEmployees();


    }



}