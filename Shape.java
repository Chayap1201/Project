class Shape1 {
    String color;

    Shape1(String color) {
        this.color = color;
    }
}

class Circle extends Shape1 {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Color: " + color);
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape1 {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Color: " + color);
        System.out.println("Area of Rectangle: " + (length * width));
    }
}


public class Shape {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);

        c.area();
        r.area();
    }
}
