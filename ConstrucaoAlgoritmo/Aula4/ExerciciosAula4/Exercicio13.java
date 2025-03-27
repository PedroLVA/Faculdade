package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Digite um numero: ");
        int first = scan.nextInt();
        int min = first;
        int max = first;

        for (int i = 1; i <= 9; i++) {
            System.out.println((i + 1) + ") Digite um numero: ");
            first = scan.nextInt();

            if (first < min) {
                min = first;
            } else if (first > max) {
                max = first;
            }
        }
        System.out.println("O numero minimo é: " + min);
        System.out.println("O numero maximo é: " + max);
    }

}
