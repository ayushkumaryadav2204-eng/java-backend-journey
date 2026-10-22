
/*
 * Topic: Abstract Class in Java
 *
 * WHAT IS AN ABSTRACT CLASS?
 *
 * An abstract class is a class declared using the abstract keyword.
 * It is used as a blueprint for other classes.
 *
 * An abstract class can contain:
 * 1. Abstract methods (methods without a body).
 * 2. Concrete methods (methods with a body).
 * 3. Instance variables.
 * 4. Constructors.
 * 5. Static methods.
 * 6. Final methods.
 *
 * IMPORTANT RULES OF ABSTRACT CLASS:
 *
 * 1. An abstract class is declared using the abstract keyword.
 * 2. We cannot create an object of an abstract class directly.
 * 3. An abstract class can have both abstract and concrete methods.
 * 4. An abstract method has no method body.
 * 5. An abstract method must be implemented by a concrete subclass.
 * 6. If a subclass does not implement all inherited abstract methods,
 *    that subclass must also be declared abstract.
 * 7. An abstract class can extend another abstract class.
 * 8. A concrete subclass must implement all inherited abstract methods
 *    that remain unimplemented.
 * 9. An abstract class can have constructors, which run during
 *    subclass object creation.
 * 10.abstract class cannot be used to create an object directly, but you can create a reference variable of its type.
 * 11. Abstract methods cannot be private, static, or final.
 * 12. An abstract class can contain final and static methods.
 * 13. Abstract classes support inheritance and runtime polymorphism.
 *
 * WHY USE AN ABSTRACT CLASS?
 *
 * 1. To provide a common blueprint for related classes.
 * 2. To force subclasses to implement required behaviors.
 * 3. To share common code between related classes.
 * 4. To achieve abstraction in Java.
 *
 * EXAMPLE:
 *
 * Car       -> Abstract parent class
 * Toyota    -> Abstract child class
 * AdvToyota -> Concrete child class
 *
 */

// Abstract parent class
abstract class Car {

    // Abstract method: declaration only, no body.
    // Subclasses must implement it unless they remain abstract.
    abstract void drive();

    // Another abstract method.
    abstract void fly();

    // Concrete method: has a method body.
    // Subclasses inherit this method.
    void music() {
        System.out.println("Music is playing.");
    }
}

// Abstract child class
abstract class Toyota extends Car {

    // Implementing the inherited abstract drive() method.
    @Override
    void drive() {
        System.out.println("Toyota is driving...");
    }

    // fly() is not implemented here.
    // Therefore, Toyota must remain abstract.
}

// Concrete child class
class AdvToyota extends Toyota {

    // Implementing the remaining abstract fly() method.
    @Override
    void fly() {
        System.out.println("Advanced Toyota is flying...");
    }

    // drive() and music() are inherited.
}

// Main class
public class AbstractClass {

    public static void main(String[] args) {

        // We cannot create an object directly from an abstract class.
        // Car car = new Car();  // Compilation error

        // Creating an object of the concrete subclass.
        AdvToyota advToyota = new AdvToyota();

        // Calling the implemented fly() method.
        advToyota.fly();

        // Calling the drive() method inherited from Toyota.
        advToyota.drive();

        // Calling the concrete method inherited from Car.
        advToyota.music();

        // Abstract class reference pointing to a concrete object.
        Car car = new AdvToyota();

        // Runtime polymorphism: Java executes AdvToyota's fly().
        car.fly();

        // Runtime polymorphism: Java executes Toyota's drive().
        car.drive();

        // The inherited concrete method is also accessible.
        car.music();
    }
}

