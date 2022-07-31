//Write an algorithm that reads a student's name and grades from the three exams he took
// in the semester. At the end, inform the student's name and average (arithmetic);

import java.util.Scanner;

public class Exer5 {

    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        String name;
        float n1, n2, n3, average;

        System.out.println("What´s your name?");
        name = reader.next();
        System.out.println("What´s your 1st grade?");
        n1 = reader.nextFloat();
        System.out.println("What´s your 2nd grade?");
        n2 = reader.nextFloat();
        System.out.println("What´s your 3rd grade?");
        n3 = reader.nextFloat();

        average = (n1+n2+n3)/3;

        System.out.println(name + ", your final grades average is " + average);

    }

}
