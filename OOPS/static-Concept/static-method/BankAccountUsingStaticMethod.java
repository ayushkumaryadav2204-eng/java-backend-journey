

/*
 * Mini Project: Bank Account Using Static Method
 *
 * Description:
 * This project demonstrates static methods using
 * basic bank account information.
 *
 * Static Method:
 * A static method belongs to the class and can be because it call automatically during the class load before creating obj 
 * called without creating an object.
 
 * Important Points:
 * 1. Static methods belong to the class.
 * 2. They can be called using the class name.
 * 3. They can directly access static members.
 * 4. They cannot directly access non-static members.
 * 5. They cannot use this or super bcz no obj is created during calling static method.
 * 6. The main() method is static.
 

 *
 * Concepts Used:
 * 1. Static methods
 * 2. Classes and objects
 * 3. Methods and parameters
 */

class BankAccount {
  static String bankName = "XYZ";
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    static void showBankName() {
        System.out.println("Bank Name:"+ bankName); // can't directly access non-static variable, method
    }                                                  //but indirectly access instance variables through an object reference by passing that object to the static method.

    void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountUsingStaticMethod {
    public static void main(String[] args) {
      //static method call
        BankAccount.showBankName();

        BankAccount account =
            new BankAccount("Rahul", 5000.0);

        account.showAccountDetails();
    }
}
