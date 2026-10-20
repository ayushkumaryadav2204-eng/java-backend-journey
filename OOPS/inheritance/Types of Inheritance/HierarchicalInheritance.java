/*
 * HIERARCHICAL INHERITANCE IN JAVA
 *
 * 1. Multiple child classes inherit from one parent class.
 *
 * 2. The 'extends' keyword is used to inherit a class.
 *
 * 3. The parent class is called the superclass.
 *
 * 4. Each child class is called a subclass.
 *
 * 5. All child classes can reuse accessible members
 *    of the same parent class.
 *
 * 6. Each child class can have its own methods and fields.
 *
 * 7. A child class can override an inherited method.
 *
 * 8. Java supports hierarchical inheritance through classes.
 *
 * Example:
 *    Dog extends Animal
 *    Cat extends Animal
 */


class Animal { // Parent class

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal { // Child class 1

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal { // Child class 2

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
