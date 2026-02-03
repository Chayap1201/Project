
class Appliance {
    int powerRating; 

    Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    void turnOn() {
        System.out.println("Appliance is turned on. Power rating: " + powerRating + "W");
    }
}


class WashingMachine extends Appliance {

    WashingMachine(int powerRating) {
        super(powerRating);
    }

    void washClothes() {
        System.out.println("Washing machine is washing clothes");
    }
}


public class session40 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(2000);

        wm.turnOn();      
        wm.washClothes(); 
    }
}
