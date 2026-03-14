// Question 11: Hierarchical Inheritance example

class Shape {

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class HierarchicalShape {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display();
        c.area();

        r.display();
        r.area();
    }
}