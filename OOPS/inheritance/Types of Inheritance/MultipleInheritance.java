/*
Multiple Inheritance in Java

1. Multiple inheritance means one child class inherits from more than one parent class.

2. Java does NOT support multiple inheritance using classes.

3. A class cannot extend two classes at the same time.

4. Java supports multiple inheritance through interfaces.

5. Interfaces allow a class to implement multiple interfaces.
*/

interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

public class MultipleInheritance implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father");
    }

    public void showMother() {
        System.out.println("This is Mother");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();

        obj.showFather();
        obj.showMother();
    }
}
