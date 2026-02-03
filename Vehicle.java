class Vehicle1 {
    String brand;
    int speed;

    Vehicle1(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle1 {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}


public class  Vehicle {
    public static void main(String[] args) {
        Car c = new Car("Honda", 150, "Petrol");
        c.display();
    }
}

