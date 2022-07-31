//Make an algorithm that receives two numbers and at the end shows the addition,
// subtraction, multiplication and division of the two numbers read;

import java.util.Scanner;

public class Exer2 {

    public static void main( String[] args ){

        Scanner reader = new Scanner(System.in);
        int n1, n2, sum, sub, multi, div = 0;

        System.out.println("Type one number: ");
        n1 = reader.nextInt();
        System.out.println("Type another number: ");
        n2 = reader.nextInt();

        sum = n1+n2;
        sub = n1-n2;
        multi = n1 * n2;
        div = n1 / n2;

        System.out.println("The sum result is " +sum );
        System.out.println("The subtraction result is " +sub );
        System.out.println("The multiplication result is " +multi );
        System.out.println("The division result is " +div );

    }
}
