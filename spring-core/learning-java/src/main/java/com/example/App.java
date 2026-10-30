package com.example;

// 1. AnnotationConfigApplicationContext:
//    - In simple words: The "Robot Helper" of Spring.
//    - What it does: In normal Java, you have to write 'new' to create every object yourself.
//      With Spring, this Robot Helper creates objects, connects them together, and manages them for you.
//    - Real-life example: Like a Restaurant Chef. You don't go into the kitchen to cook food;
//      the chef makes the food and brings it to your table.
import com.example.courseBuyHere.CourseBuyHere;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 2. @ComponentScan:
//    - In simple words: "Where to look."
//    - What it does: Tells Spring which folder to search to find your classes.
//    - Real-life example: Like telling a delivery person: "Only look for houses on 'Example Street' (com.example)."
//      Without this, Spring will not know where your code is saved.
import org.springframework.context.annotation.ComponentScan;

// 3. @Configuration:
//    - In simple words: The "Rulebook / Instruction Guide."
//    - What it does: Tells Spring: "Read this class first to see how my project is set up."
//    - Real-life example: Like the instruction manual you get with Lego toys.
//      Before you start building, you check the manual.
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.example")
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Step 1: Turn ON Spring.
        // Spring reads the rules (@Configuration) and searches your folder (@ComponentScan).
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        CourseBuyHere javaCourse = context1.getBean("javaCourseBuy", CourseBuyHere.class);
        System.out.print("Enter the amount: ");
        int amount = scan.nextInt();
        javaCourse.buyCourse(amount);
        context.close();
    }
}
