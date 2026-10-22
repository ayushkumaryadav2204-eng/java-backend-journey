
/*
 * Topic: Object Type Casting in Java
 *
 * Object type casting is the process of converting an object
 * reference from one compatible class type to another.
 *
 * Types of Object Type Casting:
 *
 * 1. Upcasting:
 *    - Converting a child class reference to a parent class reference.
 *    - It happens implicitly.
 *    - It is generally safe.
 *    - Example: Animal animal = new Dog();
 *
 * 2. Downcasting:
 *    - Converting a parent class reference to a child class reference.
 *    - It requires an explicit cast.
 *    - The actual object must be compatible with the target class.
 *    - Invalid downcasting can throw ClassCastException.
 *    - Example: Dog dog = (Dog) animal;
 *
 * Important Points to Remember:
 *
 * 1. Object type casting is used with inheritance and polymorphism.
 * 2. Upcasting provides access to members available through the parent
 *    reference, while overridden methods can execute the child's version.
 * 3. Downcasting allows access to child-specific methods.
 * 4. Casting does not create a new object or change its actual type.
 * 5. Use instanceof to check the object's type before downcasting
 *    when necessary.
 * 6. A successful cast depends on the actual object type at runtime.
 *
 * Author: Java OOPs Practice
 */

/*
 * Topic: Object Type Casting in Java
 *
 * Object type casting is the process of converting an object
 * reference from one compatible class type to another.
 *
 * Types of Object Type Casting:
 *
 * 1. Upcasting:
 *    - Converting a child class reference to a parent class reference.
 *    - It happens implicitly.
 *    - It is generally safe.
 *    - Example: Animal animal = new Dog();
 *
 * 2. Downcasting:
 *    - Converting a parent class reference to a child class reference.
 *    - It requires an explicit cast.
 *    - The actual object must be compatible with the target class.
 *    - Invalid downcasting can throw ClassCastException.
 *    - Example: Dog dog = (Dog) animal;
 *
 * Important Points to Remember:
 *
 * 1. Object type casting is used with inheritance and polymorphism.
 * 2. Upcasting provides access to members available through the parent
 *    reference, while overridden methods can execute the child's version.
 * 3. Downcasting allows access to child-specific methods.
 * 4. Casting does not create a new object or change its actual type.
 * 5. Use instanceof to check the object's type before downcasting
 *    when necessary.
 * 6. A successful cast depends on the actual object type at runtime.
 *
 * Author: Java OOPs Practice
 */

// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class
class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class
public class ObjectTypeCasting {

    public static void main(String[] args) {

        // Creating a child class object
        Dog dog = new Dog();

        // --------------------------------
        // 1. UPCASTING (Child to Parent)
        // --------------------------------

        // A parent reference points to a child object.
        // Upcasting happens automatically.
        Animal animal = dog;

        System.out.println("=== Upcasting ===");

        // Calls the overridden method of Dog.
        animal.eat();

        // animal.bark(); 
        // Error: bark() is not declared in Animal.

        // --------------------------------
        // 2. DOWNCASTING (Parent to Child)
        // --------------------------------

        // Converting the parent reference back to Dog.
        // This succeeds because the actual object is a Dog.
        Dog d = (Dog) animal;

        System.out.println("\n=== Downcasting ===");

        d.eat();
        d.bark();

        // --------------------------------
        // 3. SAFE DOWNCASTING USING instanceof
        // --------------------------------

        System.out.println("\n=== Safe Downcasting ===");

        // Check the actual object's type before casting.
        if (animal instanceof Dog) {

            Dog safeDog = (Dog) animal;
            safeDog.bark();

        } else {
            System.out.println("Object is not a Dog.");
        }

        // --------------------------------
        // 4. INVALID DOWNCASTING EXAMPLE
        // --------------------------------

        Animal anotherAnimal = new Animal();

        System.out.println("\n=== Invalid Downcasting ===");

        // The actual object is Animal, not Dog.
        // instanceof prevents an invalid cast.
        if (anotherAnimal instanceof Dog) {

            Dog anotherDog = (Dog) anotherAnimal;
            anotherDog.bark();

        } else {
            System.out.println(
                "Downcasting is not possible: object is not a Dog."
            );
        }
    }
}

