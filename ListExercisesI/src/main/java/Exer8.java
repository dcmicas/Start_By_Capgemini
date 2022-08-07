//Develop an algorithm that performs the presentation of the conversion value in brazilian reais (R$)
// of a value read in dollar (US$). The algorithm should ask for the dollar quote value and
// also the amount of dollars available with user;

import java.util.Scanner;

public class Exer8 {

    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        float real, quotation, dollar;

        System.out.println("How much US dollars (U$) are available?");
        dollar = reader.nextFloat();
        System.out.println("What is the US dollar (U$) exchange rate today?");
        quotation = reader.nextFloat();

        real = dollar*quotation;

        System.out.println("The value in brazilian reais is R$:" +real);



    }
}
