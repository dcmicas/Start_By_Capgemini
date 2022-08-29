import javax.swing.*;

public class declarandoArrays {

         public static void main(String[] args) {
            //declarando o array paises
            String[] paises = new String[4];

            //declarando o array de números
            int[] numeros = new int[10];

            //abastecendo o array de países
            for (int i = 0; i < 4; i++) {
                paises[i] = JOptionPane.showInputDialog("Informe um país");

            }
            //listando o array de países
            for (String listaPaises : paises) {
                System.out.println(listaPaises);
            }
            //abastecendo o array de números
            for (int i = 0; i < 4; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
            }
            //listando o array de números antes do calculo
            for (Integer listaNumeros : numeros) {
                System.out.println(listaNumeros);
            }
            //Alterar o valor da posição especifica.
            int novoValor = 11;
            numeros [8] = novoValor + 4;

            //listando o array de números depois do calculo
            for (Integer listaNumeros : numeros) {
                System.out.println(listaNumeros);
            }
        }}

