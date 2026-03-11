class Person {

    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Person p1 = new Person("Dnyanvi", 19);
        Person p2 = new Person("Riya", 20);

        System.out.println("Person Details:");

        p1.display();
        p2.display();
    }
}