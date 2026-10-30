package com.example.BCACourse;

import com.example.courses.Courses;

public class Python implements Courses {
    int minimumPrice;
     Python(){
        minimumPrice = 200;
    }

    public boolean show(int amount){
         this.minimumPrice = amount;
        if(minimumPrice >= 200){
            System.out.print("java course is buy");
            return true;
        }else {
            System.out.print("java course is not buy");
            return false;
        }

    }
}
