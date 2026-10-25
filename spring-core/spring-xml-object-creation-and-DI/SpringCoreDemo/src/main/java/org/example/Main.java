package org.example;

import org.example.courseBuy.CourseBuy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ============================================================================
 *                    SPRING CORE CONCEPTS & LEARNING NOTES
 * ============================================================================
 * 
 * 1. INVERSION OF CONTROL (IoC):
 *    - In traditional Java, developers write:
 *        CourseBuy buy = new CourseBuy(new JavaCourse(), 200);
 *      You manually control object creation and dependency wiring.
 *    - With Spring IoC, control is inverted: Spring creates, wires, and manages
 *      the lifecycle of all objects (called "Beans").
 * 
 * 2. SPRING CONTAINER (ApplicationContext):
 *    - ClassPathXmlApplicationContext searches the classpath (src/main/resources)
 *      for "beans.xml".
 *    - The moment this line runs, Spring creates and caches all configured beans.
 * 
 * 3. RETRIEVING BEANS (context.getBean):
 *    - context.getBean("JavaCourseBuy", CourseBuy.class);
 *      - Parameter 1: The unique 'id' defined in beans.xml.
 *      - Parameter 2: The expected Class type (avoids manual typecasting).
 * 
 * 4. LOOSE COUPLING:
 *    - Notice this Main class does NOT import JavaCourse, PythonCourse, or JS!
 *    - Main only interacts with the high-level CourseBuy abstraction.
 *    - To swap an implementation or change prices, you only update beans.xml;
 *      no Java code re-compilation is necessary!
 * ============================================================================
 */
class Main {
    public static void main(String[] args) {
        // Step 1: Start the Spring IoC Container and load beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Step 2: Request the pre-configured 'JavaCourseBuy' bean from the container
        CourseBuy javaBuy = context.getBean("JavaCourseBuy", CourseBuy.class);
        javaBuy.courseBuy();

        // Step 3: Request the pre-configured 'PythonCourseBuy' bean
        CourseBuy pythonBuy = context.getBean("PythonCourseBuy", CourseBuy.class);
        pythonBuy.courseBuy();

        // Step 4: Request the pre-configured 'JavaScript' bean

        CourseBuy javaScriptBuy = context.getBean("JavaScript", CourseBuy.class);
        javaScriptBuy.courseBuy();
    }
}
