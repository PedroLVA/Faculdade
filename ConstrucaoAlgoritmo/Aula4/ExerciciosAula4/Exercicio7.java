package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a idade da " + i + " pessoa: ");
            int idade = scan.nextInt();

            sum += idade;
        }
        System.out.println("A media das idades das pessoas é: " + sum / 20);
    }

}
