//Write an algorithm to determine the average consumption of a car given the distance
//total traveled by the car and the total amount of fuel used;

import java.util.Scanner;

public class Exer3 {
    public static void main( String[] args ){

        Scanner reader = new Scanner(System.in);
       float averageConsumption, distance, fuelUsed = 0;

        System.out.println("What is the total distance traveled?");
        distance = reader.nextFloat();
        System.out.println("How much fuel was spent?");
        fuelUsed = reader.nextFloat();

        averageConsumption = distance / fuelUsed;

        System.out.println("The average consumption is " + averageConsumption + " liters");

    }
}
