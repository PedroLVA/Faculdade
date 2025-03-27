package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        int menor = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a idade da " + i + " pessoa: ");
            int idade = scan.nextInt();
            if (idade <= 18) {
                menor++;
            }

        }
        System.out.println("O numero de pessoas menores de idade é: " + menor);
    }

}
