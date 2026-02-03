
class ElectronicDevice {
    String brand;

    ElectronicDevice(String brand) {
        this.brand = brand;
    }

    void powerOn() {
        System.out.println(brand + " device is powered on");
    }
}


class Laptop extends ElectronicDevice {
    int ramSize;

    Laptop(String brand, int ramSize) {
        super(brand);
        this.ramSize = ramSize;
    }

    void showSpecs() {
        System.out.println("Laptop RAM: " + ramSize + "GB");
    }
}


public class session37 {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 16);

        l.powerOn();    
        l.showSpecs();  
    }
}
