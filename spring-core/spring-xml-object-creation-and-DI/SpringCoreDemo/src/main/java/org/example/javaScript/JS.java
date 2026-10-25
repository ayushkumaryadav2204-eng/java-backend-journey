package org.example.javaScript;
import org.example.course.Courses;
    public class JS implements Courses {
        int takeAmount;
        public JS(){
            takeAmount = 100;
        }
        public JS(int takeAmount){
            this.takeAmount = takeAmount;
        }
        public boolean show(int amount){
            if(takeAmount <= amount){
                takeAmount = amount;
                System.out.println("you buy JS course! ");
                return true;
            }else{
                System.out.println("you not  buy JS course! ");
                return false;
            }
        }
}
