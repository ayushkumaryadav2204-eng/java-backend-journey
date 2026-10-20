/*
 * SINGLE INHERITANCE IN JAVA
 *
 * 1. One child class inherits from one parent class.
 *
 * 2. The 'extends' keyword is used to achieve inheritance.
 *
 * 3. The parent class is called the superclass.
 *
 * 4. The child class is called the subclass.
 *
 * 5. Promotes code reusability and reduces code duplication.
 *
 * 6. The child class can use inherited accessible methods
 *    and fields and define its own members.
 *
 * 7. The child class can override inherited methods.
 *
 * 8. Java allows a class to extend only one class.
 *
 * 9. Constructors are not inherited; a child constructor
 *    can call a parent constructor using 'super()'.
 *
 * 10. Inheritance supports runtime polymorphism through
 *     method overriding.
 */


class Animal {  // Parent class (Superclass)

    String name = "Dog";

    void eat() {
        System.out.println(name + " is eating");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {  // Child class (Subclass)

    void bark() {
        System.out.println(name + " is barking");
    }

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();    // Inherited method
        d.bark();   // Child's own method
        d.sound();  // Overridden method
    }
}
