//Read two values for variables A and B, and perform the exchanges of values so that
// the variable A pass to have the value of the variable B and the variable B
// will have the value of the variable A. Present the values change;

import java.util.Scanner;

public class Exer6 {
    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        String a, b;
        String temp = "";

        System.out.println("Enter the first value: ");
        a = reader.next();
        System.out.println("Enter the second value: ");
        b = reader.next();

        System.out.println("Value A: " + a + " / Value B: " +b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Changed: Value A: " + a + " / Value B: " +b);

    }

}
