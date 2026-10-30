package com.example.BCACourse;

import com.example.courses.Courses;

public class Cpps implements Courses {
    int amount;

    Cpps(){
        this.amount = 200;
    }
    public boolean show(int amount){
        this.amount = amount;
        if(this.amount >= 200){
            System.out.println("course is buy");
            return true;
        }else{
            System.out.println("course is not buy");
            return false;
        }
    }
}
