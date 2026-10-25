package org.example.pythonCourse;
import org.example.course.Courses;

public class PythonCourse implements Courses {
    int pythonCourseMinPrice;
    public PythonCourse(){
        pythonCourseMinPrice = 100;
    }
    @Override
    public boolean show(int amount){
        if(amount > pythonCourseMinPrice){
            pythonCourseMinPrice = amount;
            System.out.println("Python course is successfully take at: "+ pythonCourseMinPrice);
            return true;
        }else{
            System.out.println("python course is fail at: "+ pythonCourseMinPrice);
            return false;
        }
    }
}
