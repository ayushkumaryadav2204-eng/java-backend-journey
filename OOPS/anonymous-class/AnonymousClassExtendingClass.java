/*
 * Topic: Anonymous Class Extending a Class in Java
 *
 * Definition:
 An anonymous class has no separate class declaration with a name. Its definition and object creation happen together.
 The object belongs to the anonymous subclass, but the reference variable's type is the parent class.
 */

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousClassExtendingClass {
    public static void main(String[] args) {

        // Anonymous class extending the Animal class
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        // Calling the overridden method
        dog.sound();
    }
}

/*
 * Output:
 * Dog barks
 *
 * Important Points to Remember:
 *
 * 1. An anonymous class has no name.
 * 2. you create the class and its object at the same time in one statement.
 * 3. It can extend only ONE class.
 * 4. It can override accessible methods of the parent class.
 * 5. It can use inherited methods and fields from the parent class.
 * 6. It cannot declare a constructor because it has no class name.
 * 7. It can have its own fields, methods, and initializer blocks.
 * 8. Local variables accessed from the enclosing method must be
 *    final or effectively final.
 * 9. It is useful for one-time implementations.
 * 10. The reference type determines which members can be accessed
 *     directly through the reference.
 * 11. The overridden method is selected at runtime (dynamic dispatch).
 * 12. Use a named subclass when you need to reuse the implementation.
 */

//5. It can use inherited methods and fields from the parent class.
//means anonymous class can use the variables (fields) and methods it inherits from its parent class.

class Animal {
    String name = "Tommy";

    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Main {
    public static void main(String[] args) {

      // subclass extends from parents
        Animal dog = new Animal() { //dog stores a reference to that anonymous subclass object
            @Override
            void eat() {  //use the variables (fields) and methods from parents.
                System.out.println(name + " is eating");
            }
        };

        dog.eat();
    }
}






/*
You can access inherited(parents) fields inside an anonymous class's own methods, 
but you cannot call an anonymous-class method through a reference typed as its parent class.
*/
//EXAMPLE
class A {
    String name = "Tommy";

    public void show() {
        System.out.println("In A show!");
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A() {
            public void show() {
                System.out.println("no name of class");
            }

            void show1() {
                System.out.println(name);
            }
        };

        a.show1(); // Compilation error
    }
}

//SOLUTION
class A {
    String name = "Tommy";

    public void show() {
        System.out.println("In A show!");
    }
}
A a = new A() {
    public void show() {
        System.out.println("no name of class");
    }

    void show1() {
        System.out.println(name);
    }

    {
        show1();
    }
};

//outPut: Tommy  initializer block executes one time for each object created. which is not in parents, so first define then call in block;




/*
With the help of same reference so we can call anonymous obj method multiple time
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Main {
    public static void main(String[] args) {

        Animal a = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        a.sound(); // First call --> obj11
        a.sound(); // Second call---> obj2
        a.sound(); // Third call --> obj3
    }
}


/*
  Anonymous class can use a local variable from the surrounding method only if that variable is final or effectively final.

*/

class Main {
    public static void main(String[] args) {
        String name = "Tommy"; // Effectively final

        Animal a = new Animal() {
            void show() {
                System.out.println(name);
            }
        };

        a.show();
    }
}

class Animal {
    void show() {
        System.out.println("Animal");
    }
}



class Main {
    public static void main(String[] args) {
        String name = "Tommy"; // but
      name = "Ayush"

        Animal a = new Animal() {
            void show() {
                System.out.println(name);   // Erroor: the anonymous class cannot capture it. becaues it one time execute;
            }
        };

        a.show();
    }
}
class Animal {
    void show() {
        System.out.println("Animal");
    }
}
