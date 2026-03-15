abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return (salary * 0.10) + incentive;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e;

        e = new Manager("Rahul", 101, 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Amit", 102, 40000, 5000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}