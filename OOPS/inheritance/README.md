# Java Inheritance

## What is Inheritance in Java?

Inheritance is one of the fundamental concepts of Object-Oriented Programming (OOP) in Java. It allows one class to acquire the properties and methods of another class.

Inheritance helps us reuse existing code, reduce code duplication, and extend the functionality of existing classes.

## Key Terminology

- **Parent Class (Superclass):** The class whose properties and methods are inherited.
- **Child Class (Subclass):** The class that inherits from another class.
- **`extends` keyword:** Used to inherit from a class in Java.

## Syntax

```java
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}
```

## Types of Inheritance

1. **Single Inheritance:** One child class inherits from one parent class.
2. **Multilevel Inheritance:** A class inherits from a class that inherits from another class.
3. **Hierarchical Inheritance:** Multiple child classes inherit from one parent class.
4. **Multiple Inheritance:** A class inherits from multiple parents. Java does not support this through classes, but supports multiple inheritance of type through interfaces.
5. **Hybrid Inheritance:** A combination of inheritance types. Java can implement certain hybrid structures using interfaces.

## Advantages of Inheritance

- Code reusability
- Reduced code duplication
- Easier code maintenance
- Extending existing classes
- Supports runtime polymorphism through method overriding

## Mini Project: Calculator Using Inheritance

This project demonstrates inheritance by creating a basic calculator and an advanced calculator.

- Object-Oriented Programming (OOP)
- Git and GitHub
