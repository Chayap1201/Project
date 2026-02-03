class Rectangle{
    
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double area() {
        return length * width;
    }

    
    double perimeter() {
        return 2 * (length + width);
    }
}

public class session2 {
    public static void main(String[] args) {
        // Create a rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Print area and perimeter
        System.out.println("Length: " + rect.length);
        System.out.println("Width: " + rect.width);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
