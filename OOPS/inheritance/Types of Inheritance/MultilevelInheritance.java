/*
 * MULTILEVEL INHERITANCE IN JAVA
 *
 * 1. A class inherits from another child class,
 *    forming a chain of inheritance.
 *
 * 2. The 'extends' keyword is used to achieve inheritance.
 *
 * 3. The class at the beginning of the chain is the
 *    superclass, and the next classes are subclasses.
 *
 * 4. A child class inherits accessible members through
 *    its parent class from higher-level ancestors.
 *
 * 5. Promotes code reusability and reduces duplication.
 *
 * 6. Each class can define its own additional methods
 *    and fields.
 *
 * 7. A subclass can override an inherited method.
 *
 * 8. Java supports multilevel inheritance through classes.
 *
 * Example:
 *    class B extends A
 *    class C extends B
 *
 *    C can use accessible inherited members from both
 *    B and A.
 */


class Animal { // Grandparent class

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal { // Parent class

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog { // Child class

    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();  // Inherited from Animal
        p.bark(); // Inherited from Dog
        p.weep(); // Defined in Puppy
    }
}
