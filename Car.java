public class Car {
    private int speed; 

    
    public Car(int speed) {
        setSpeed(speed); 
    }

    
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Must be between 0 and 200.");
        }
    }

    
    public int getSpeed() {
        return speed;
    }

    
    public static void main(String[] args) {
        Car car = new Car(100);
        System.out.println("Speed: " + car.getSpeed());

        car.setSpeed(250); 
        System.out.println("Speed: " + car.getSpeed()); 

        car.setSpeed(180); 
        System.out.println("Speed: " + car.getSpeed()); 
    }
}
