/*
Hybrid Inheritance in Java

1. Hybrid inheritance is a combination of two or more types
   of inheritance.

2. It can combine single, multilevel, and hierarchical inheritance.

3. Java does not support hybrid inheritance using classes alone
   when it creates multiple inheritance of classes.

4. Hybrid inheritance can be achieved using interfaces.

5. Interfaces help a class inherit behavior contracts from
   multiple sources.
*/


interface Pet {
    void play();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog is playing");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
        p.weep();
    }
}
