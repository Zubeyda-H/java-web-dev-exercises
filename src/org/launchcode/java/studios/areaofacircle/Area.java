package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

    public Area() {
    }

    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping=true;
            while(keepOnLooping){
                Double radius = input.nextDouble();

                if (radius < 0) {
                    System.out.println("Enter positive number");
                } else {
                    Double area = Circle.getArea(radius);
                    System.out.println("The area of a circle is  " + area + ".");
                    keepOnLooping=false;
                }
            }
            } catch(Exception error){
                System.out.println("Enter a number");

            }

            input.close();
        }

}


