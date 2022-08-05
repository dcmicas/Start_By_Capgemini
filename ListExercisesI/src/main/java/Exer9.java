//Make an algorithm that takes an amount that has been deposited and displays
// the amount with yield after a month.Consider fixed interest on savings at 0.07% a. m;

import java.util.Scanner;

public class Exer9 {

    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        float deposit, totalAmount;
        int months;

        System.out.println("What is the amount deposited?");
        deposit = reader.nextFloat();
        System.out.println("How many months is it yielding?");
        months = reader.nextInt();

        totalAmount = (deposit * 0,07)

    }
}
