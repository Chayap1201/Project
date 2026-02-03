class Car {
    
    String brand;
    String model;
    double price;

    
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("---------------------");
    }
}

public class session3 {
    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota", "Corolla", 25000);
        Car car2 = new Car("Honda", "Civic", 27000);

        
        car1.displayDetails();
        car2.displayDetails();
    }
}
