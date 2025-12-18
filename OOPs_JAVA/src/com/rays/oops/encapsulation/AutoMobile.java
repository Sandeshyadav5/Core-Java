package com.rays.oops.encapsulation;

public class AutoMobile {
    private String color;
    private int speed;
    private String make;

    public static final int NO_OF_GEARS = 6;
    private int currentGear = 1;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void changeGear(int gear) {
        if (gear > 0 && gear <= NO_OF_GEARS) {
            currentGear = gear;
            System.out.println("Gear changed to: " + currentGear);
        } else {
            System.out.println("Invalid gear. Select between 1 and " + NO_OF_GEARS);
        }
    }

    public void brake() {
        if (speed <= 0) {
            speed = 0;
            System.out.println("Car is already stopped.");
        } else {
            speed -= 10;
            System.out.println("Braked. Current speed: " + speed + " km/h");
        }
    }

    public void accelerate() {
        if (speed < 400) {
            speed += 10;
            System.out.println("Accelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Maximum speed reached.");
        }
    }
}
