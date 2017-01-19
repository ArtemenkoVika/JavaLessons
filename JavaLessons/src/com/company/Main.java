package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tank1 = new Tank("green", 45000, 1400, 230);
        Tank tank2 = new Tank("green", 45000, 1400, 230);
        Plane plane1 = new Plane("green", 33000, 1200, 2300);
        Plane plane2 = new Plane("green", 33000, 1300, 2300);

        System.out.println(tank1.equals(tank2));
        System.out.println(plane1.equals(plane2));
    }
}
