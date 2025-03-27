package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countZero = 0;
        int countPos = 0;
        int countNeg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ") Digite um numero: ");
            int num = scan.nextInt();

            if (num < 0) {
                countNeg++;
            } else if (num > 0) {
                countPos++;
            } else {
                countZero++;
            }

        }
        System.out.println("-------------------------------");
        System.out.println("Qtd numeros postivos: " + countPos);
        System.out.println("Qtd numeros negativos: " + countNeg);
        System.out.println("Qtd de zeros: " + countZero);
    }

}
