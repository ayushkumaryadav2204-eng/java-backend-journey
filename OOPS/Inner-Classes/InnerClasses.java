
// Concept: Inner Class (Non-Static Nested Class) in Java

class A {

    void show() {
        System.out.println("In A show");
    }

    // Inner class: a class declared inside another class
    class B {

        void show() {
            System.out.println("In B show!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating an object of the outer class
        A a = new A();

        // Creating an object of the inner class
        // Syntax: OuterClass.InnerClass obj = outerObject.new InnerClass();
        A.B obj1 = a.new B();

        // Calling the outer class method
        a.show();

        // Calling the inner class method
        obj1.show();
    }
}

/*
OUTPUT:
In A show
In B show!

IMPORTANT POINTS TO REMEMBER:

1. An inner class is a class declared inside another class.

2. A non-static inner class is associated with an
   instance of its outer class.

3. To create an object of a non-static inner class,
   first create an object of the outer class.

4. Syntax to create an inner class object:
   OuterClass.InnerClass obj = outerObject.new InnerClass();

5. An inner class can directly access the instance
   members of its outer class, including private members.

6. If both classes have methods with the same name,
   the method called depends on which object is used.

   a.show()   -> Calls A's show() method
   obj1.show() -> Calls B's show() method

7. The inner class method does NOT automatically
   override the outer class method. They are methods
   in two different classes.


8. A static nested class is different from a non-static
   inner class. A static nested class does not require
   an outer-class object to create its instance.

   class A {
    static class B {
        void show() {
            System.out.println("Static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // No object of A is required
        A.B obj = new A.B();

        obj.show();
    }
}

*/
```
