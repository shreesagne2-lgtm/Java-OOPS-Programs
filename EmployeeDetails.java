class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anita", 50000);
        Employee e2 = new Employee("Rohit", 60000);

        e1.display();
        e2.display();
    }
}