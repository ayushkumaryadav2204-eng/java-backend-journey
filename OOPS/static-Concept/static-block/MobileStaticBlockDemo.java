
/*
 * Mini Project: Mobile Details Using Static Block
 *
 * Static Block:
 * A static block is used to initialize static variables
 * when the class is initialized.
 *
 * Why Does It Execute Only Once?
 * A static block executes only once per class loader
 * during class initialization, regardless of how many
 * objects are created from the class.
 *
 * In This Project:
 * The static block initializes the shared variable
 * 'type' with the value "smartphone".
 * Even though two Mobile objects are created, the
 * static block executes only once.
 *
 * Concepts Used:
 * 1. Static block
 * 2. Static variable
 * 3. Constructors
 * 4. Objects
 * 5. Instance variables
 */

class Mobile {
    int model;
    String name;
    static String type;

    static {
        type = "smartphone";
        System.out.println("Static block executed");
        System.out.println();
    }

    public Mobile() {
        model = 101;
        name = "--!";
    }

    public Mobile(int model, String name) {
        this.model = model;
        this.name = name;
    }

    public void show() {
        System.out.println("Model: " + model);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

public class MobileStaticBlockDemo {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        Mobile mob1 = new Mobile(111, "Poco");

        mob1.show();

        System.out.println();

        mob.show();
    }
}

/*
Output:
Static block executed

Model: 111
Name: Poco
Type: smartphone

Model: 101
Name: --!
Type: smartphone
*/
