package pro.sky.java.course1.kursachcourse1;



public class KursachCourse1 {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        Employee employee1 = new Employee("Ivan Ivanovich Ivanov ", 1, 1000);
        Employee employee2 = new Employee("Sergey Sergeevich Sergeev", 2, 10000);
        Employee employee3 = new Employee("Uiriy Uirevuch Uiriev", 3, 100002);
        Employee employee4 = new Employee("Anna Ivanovna Ivanova", 4, 100000);
        Employee employee5 = new Employee("Anna Ivanovna Ivanova", 5, 100004);
        Employee employee6 = new Employee("Anna Ivanovna Ivanova", 5, 100006);
        Employee employee7 = new Employee("Uiriy Sergeevich Sergeev", 4, 100007);
        Employee employee8 = new Employee("Genadziy Sergeevich Sergeev", 3, 100008);
        Employee employee9 = new Employee("Genadziy Uirevuch Petrov", 2, 100001);
        Employee employee10 = new Employee("Genadziy Sergeevich Petrov", 1, 100);
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
        employeeBook.changeEmployeeSalaryByName(employee1.getName(), 12345);
        employeeBook.changeEmployeeDepartmentByName(employee1.getName(), 2);
        employeeBook.deleteEmployee(employee5);
        employeeBook.deleteEmployeeName(employee6.getName());
        employeeBook.printAllEmployees();
        System.out.println(employeeBook.calculateAllSpendings());
        System.out.println(employeeBook.minSalary());
        System.out.println(employeeBook.averageSpendings());
        System.out.println(employeeBook.maxSalary());
        employeeBook.printAllEmployeesNames();
        employeeBook.changeAllSalaries(10f);
        System.out.println(employeeBook.minSalaryDepartment(1));
        System.out.println(employeeBook.maxSalaryDepartment(1));
        System.out.println(employeeBook.departmentSalarySpendings(1));
        System.out.println(employeeBook.departmentAverageSalarySpendings(1));
        employeeBook.changeDepartmentSalaries(10,1);
        System.out.println(employeeBook.salaryToValueLess(1000001));
        System.out.println(employeeBook.salaryToValueMoreOrEqual(100000));
        employeeBook.printAllEmployeesNames();


    }



}