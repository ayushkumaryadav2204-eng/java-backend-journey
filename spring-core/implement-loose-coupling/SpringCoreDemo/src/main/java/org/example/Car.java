package org.example;


import org.example.ElectricEngine.ElectricEngine;
import org.example.engine.Engine;
import org.example.petrolEngine.PatrolEngine;

public class Car {
    private Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        engine.start();
    }
    public static void main(String[] args) {
        ElectricEngine myEngine = new ElectricEngine();

        Car mycar = new Car(myEngine);
        mycar.drive();
        Car mycar1 = new Car(new PatrolEngine());
        mycar1.drive();

    }
}
