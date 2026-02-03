public class Employee {
    private double salary; 

    
    public Employee(double salary) {
        setSalary(salary); 
    }

    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(5000);
        System.out.println("Salary: " + emp.getSalary()); 

        emp.setSalary(-1000); 
        System.out.println("Salary: " + emp.getSalary()); 

        emp.setSalary(7000);
        System.out.println("Salary: " + emp.getSalary()); 
    }
}
