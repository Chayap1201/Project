public class Temperature {
    private double celsius;

    
    public Temperature(double value) {
        setCelsius(value); 
    }

    
    public void setCelsius(double value) {
        if (value >= -273.15) {
            this.celsius = value;
        }
    }

    
    public double getCelsius() {
        return celsius;
    }

    
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        System.out.println("Temperature: " + temp.getCelsius()); 

        temp.setCelsius(-300);
        System.out.println("Temperature: " + temp.getCelsius()); 

        temp.setCelsius(-100); 
        System.out.println("Temperature: " + temp.getCelsius()); 
    }
}
