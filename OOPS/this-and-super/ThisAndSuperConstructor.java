
/*
====================================================
TOPIC: JAVA CONSTRUCTORS, super() AND this()
====================================================

1. CONSTRUCTOR:
   - A constructor initializes an object.
   - Its name must be the same as the class name.
   - A constructor has no return type, not even void.
   - A constructor is invoked during object creation.

2. TYPES OF CONSTRUCTORS:
   - Default constructor: Provided by the compiler if no
     constructor is declared in the class.
   - No-argument constructor: A constructor with no parameters.
   - Parameterized constructor: A constructor with parameters.
   - Copy constructor: A programmer-defined constructor that
     copies data from another object of the same class.

3. WHAT IS super()?
   - super() calls the immediate parent class constructor.
   - super(arguments) calls a parameterized parent constructor.
   - If no constructor invocation is written, Java normally
     inserts super() automatically when it is valid.

4. WHAT IS this()?
   - this() calls another constructor in the same class.
   - this(arguments) calls another constructor in the same
     class with the specified arguments.
   - It is useful for constructor chaining and avoiding
     duplicate initialization code.

5. IMPORTANT RULES:
   - Traditionally, this() or super() must be the first
     statement in a constructor.

6. DIFFERENCE:
   - this()  = Calls a constructor in the same class.
   - super() = Calls a constructor in the parent class.
   - this    = Refers to the current object.
   - super   = Refers to the parent-class members.

7. EXECUTION FLOW OF THIS PROGRAM:
   - main() calls new B(22).
   - B(int q) calls this(), which invokes B().
   - B() implicitly calls super(), which invokes A().
   - A() executes first and prints "A is call".
   - Control returns to B() and prints its message.
   - Control returns to B(int q) and prints "B is call".

8. EXPECTED OUTPUT:
   A is call
   B is call.....................
   B is call

====================================================
*/

// Parent class
class A {

    // No-argument constructor
    A() {
        System.out.println("A is call");
    }

    // Parameterized constructor
    A(int a) {
        System.out.println("int A is call");
    }
}

// Child class
class B extends A {

    // No-argument constructor
    B() {
        // Java implicitly calls super() here.
        System.out.println("B is call.....................");
    }

    // Parameterized constructor
    B(int q) {
        this(); // Calls B() in the same class.
        System.out.println("B is call");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creates an object using the parameterized constructor.
        B obj = new B(22);
    }
}
