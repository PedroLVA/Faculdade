package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countEntre = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();

            if (numero > 0 && numero < 100) {
                countEntre++;
            } else {

            }

        }
        System.out.println("Quantidade de numeros que estavam entre 0 e 100: " + countEntre);
    }

}
