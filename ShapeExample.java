// Question 7: Abstract class example

abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape object.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculate_area() {
        return length * width;
    }
}

public class ShapeExample {

    public static void main(String[] args) {

        // Shape s = new Shape(); // This will give compilation error

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        System.out.println("Circle Area = " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area = " + r.calculate_area());
    }
}