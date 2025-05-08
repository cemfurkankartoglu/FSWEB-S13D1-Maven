package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking || clock < 0) {
            return false;
        } else return clock < 8 || clock > 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);
       }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && temp > 25 && temp < 45) {
            return true;
        } else return !isSummer && temp > 25 && temp <= 35;
    }

    public static double area(double width, double height) {
       if (width < 0 || height <0) {
           return -1;
       } else {
           return width * height;
       }
    }

    public static double area(double radius) {
       if (radius < 0) {
           return -1;
       } else {
           return radius * radius * Math.PI;
       }
    }
}
