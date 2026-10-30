package com.example.BCACourse;
import com.example.courses.*;

public class Java implements Courses {
    int amount;
    Java(){
        amount = 200;
    }
    public boolean show(int amount){
        this.amount = amount;
        if(this.amount >= 200){
            System.out.print("java course is buy");
            return true;
        }else{
            System.out.print("java coure is not buy");
            return false;
        }
    }
}
