// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Must override the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class AbstractExample {
    public static void main(String[] args) {
        // We can't create object of abstract class directly
        Animal a = new Dog(); // Polymorphism
        a.sound();            // Calls Dog's version
        a.eat();              // Calls inherited method
    }
}
