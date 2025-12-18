package com.rays.oops.encapsulation;

public class TestAutomobile {
    public static void main(String[] args) {

        AutoMobile fortuner = new AutoMobile();

        fortuner.setColor("Black");
        fortuner.setSpeed(34);
        fortuner.setMake("Toyota Fortuner");

        System.out.println("Fortuner Color = " + fortuner.getColor());
        System.out.println("Fortuner Speed = " + fortuner.getSpeed());
        System.out.println("Fortuner Make  = " + fortuner.getMake());

        fortuner.brake();          
        fortuner.changeGear(2);    
        fortuner.accelerate();    
    }
}
