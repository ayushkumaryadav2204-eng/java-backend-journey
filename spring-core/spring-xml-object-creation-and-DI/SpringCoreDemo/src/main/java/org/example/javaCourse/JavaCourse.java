package org.example.javaCourse;
import org.example.course.Courses;
public class JavaCourse implements Courses {
    int javaCourseMinPrice;
   public JavaCourse(){
       javaCourseMinPrice = 100;
    }
    public boolean show(int amount){
       if(amount >= javaCourseMinPrice){
           System.out.println("java course is buy");
           return true;
       }else{
           System.out.println("java course is not buy");
           return false;
       }
    }
}
