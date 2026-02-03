class Mobile {
    
    String brand;
    int batteryPercentage;

    
    Mobile(String brand, int batteryPercentage) {
        this.brand = brand;
        if (batteryPercentage < 0) {
            this.batteryPercentage = 0;
        } else if (batteryPercentage > 100) {
            this.batteryPercentage = 100;
        } else {
            this.batteryPercentage = batteryPercentage;
        }
    }
    void charge(int percent) {
        if (percent < 0) {
            System.out.println("Cannot charge negative percentage.");
            return;
        }
        batteryPercentage += percent;
        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }
        System.out.println(brand + " charged to " + batteryPercentage + "%");
    }

    
    void useBattery(int percent) {
        if (percent < 0) {
            System.out.println("Cannot use negative percentage.");
            return;
        }
        batteryPercentage -= percent;
        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }
        System.out.println(brand + " battery now at " + batteryPercentage + "%");
    }

    
    void displayStatus() {
        System.out.println("Brand: " + brand + ", Battery: " + batteryPercentage + "%");
    }
}

public class session9 {
    public static void main(String[] args) {
        Mobile phone = new Mobile("Samsung", 50);
        phone.displayStatus();
        phone.useBattery(30);
        phone.charge(60);
        phone.useBattery(150);
        phone.charge(200);
    }
}
