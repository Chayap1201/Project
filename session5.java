class Employee {
    
    String name;
    double basicSalary;

    
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    double calculateGrossSalary() {
        double hra = 0.2 * basicSalary; 
        double da = 0.1 * basicSalary;  
        return basicSalary + hra + da;
    }

    
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("----------------------");
    }
}

public class session5 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alice", 5000);
        Employee emp2 = new Employee("Bob", 7000);

        
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
