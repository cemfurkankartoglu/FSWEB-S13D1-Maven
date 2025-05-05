package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking) {
            return false;
        } else if (clock < 8 || clock > 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if ((firstAge > 13 && firstAge < 19) || (secondAge > 13 && secondAge < 19) || (thirdAge > 13 && thirdAge < 19) ) {
           return true;
       } else {
               return false;
           }
       }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
