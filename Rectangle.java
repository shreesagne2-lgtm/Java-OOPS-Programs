// Write a program to print the area of two rectangles using constructor and Area() method

class Rectangle {

    int length;
    int breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1: " + r1.Area());
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}
