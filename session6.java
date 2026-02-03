class Circle {
    double radius;

    
    Circle(double radius) {
        this.radius = radius;
    }

    
    double area() {
        return Math.PI * radius * radius;
    }

    
    void displayArea() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area());
        System.out.println("----------------------");
    }
}

public class session6 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(7.5);

        
        c1.displayArea();
        c2.displayArea();
    }
}
