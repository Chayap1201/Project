public class Mobile {
    private int batteryLevel; 

    
    public Mobile(int batteryLevel) {
        this.batteryLevel = (batteryLevel >= 0 && batteryLevel <= 100) ? batteryLevel : 0;
    }

    
    public void charge(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
    }

    
    public void use(int amount) {
        batteryLevel -= amount;
        if (batteryLevel < 0) batteryLevel = 0;
    }


    public int getBatteryLevel() {
        return batteryLevel;
    }


    public static void main(String[] args) {
        Mobile phone = new Mobile(50);
        phone.charge(30); 
        System.out.println(phone.getBatteryLevel()); 
        phone.use(90);
        System.out.println(phone.getBatteryLevel());
    }
}
