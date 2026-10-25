package org.example.courseBuy;
import org.example.course.Courses;

public class CourseBuy {
    int takeAmount;
    private Courses courses;
    public CourseBuy(Courses courses,int takeAmount){
        this.courses = courses;
        this.takeAmount = takeAmount;
    }
    public void courseBuy(){
        courses.show(takeAmount);
    }
}
