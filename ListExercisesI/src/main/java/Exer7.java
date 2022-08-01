//Read a temperature in degrees Celsius and display it converted to degrees Fahrenheit. The formula of
//conversion is: F=(9*C+160) / 5, where F is the temperature in Fahrenheit and C is the temperature in Celsius;

import java.util.Scanner;

public class Exer7 {

    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        float tempC, tempF;

        System.out.println("What is the temperature in Celsius?");
        tempC = reader.nextFloat();

        tempF = (9*tempC+160)/5;

        System.out.println("The temperature in Fahrenheit is " + tempF);


    }
}
