//Write an algorithm that reads a salesperson's name, their fixed salary and the total sales made
//for it in the month (in cash). Knowing that this seller earns 15% commission on their sales
//made, inform your name, fixed salary and salary at the end of the month;

import java.util.Scanner;

public class Exer4 {

    public static void main (String [] args) {

        Scanner reader = new Scanner(System.in);
        String salesperson;
        float calc, fixedSalary, totalSales, finalSalary;


        System.out.println("What´s your name?");
        salesperson = reader.next();
        System.out.println("What´s your fixed Salary?");
        fixedSalary = reader.nextFloat();
        System.out.println("What was the total value of cash sales this month?");
        totalSales = reader.nextFloat();

        calc = (float) (totalSales * 0.15);
        finalSalary = fixedSalary + calc;

        System.out.println(salesperson + ", your final salary this month is $" +finalSalary);



    }
}
