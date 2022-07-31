//Make an algorithm that takes two numbers and displays the result of their sum;


import java.util.Scanner;

public class Exer1 {

    public static void main( String[] args ){

        Scanner reader = new Scanner(System.in);
        int n1, n2, calc = 0;

        System.out.println("Type one number: ");
        n1 = reader.nextInt();
        System.out.println("Type another number: ");
        n2 = reader.nextInt();

        calc = n1+n2;

        System.out.println("The sum of the numbers is: " +calc);

    }


}
