package com.example.courseBuyHere;

import com.example.courses.Courses;

public class CourseBuyHere {
    private Courses courses;

    CourseBuyHere(Courses courses) {
        this.courses = courses;
    }

    public void buyCourse(int userAmount) {
        System.out.println("You entered amount: " + userAmount);
        this.courses.show(userAmount);
    }

}


