
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void code() {
        System.out.println(name + " is coding");
    }
}


class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void manageTeam() {
        System.out.println(name + " is managing the team");
    }
}


public class Employee0 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 50000);
        Manager mgr = new Manager("Bob", 80000);

        dev.display();
        dev.code();

        System.out.println();

        mgr.display();
        mgr.manageTeam();
    }
}
