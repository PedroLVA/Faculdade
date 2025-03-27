package Aula3;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Agora digite sua altura em cm: ");
        int altura = scan.nextInt();

        System.out.print("Agora digite o seu peso em kg: ");
        double peso = scan.nextDouble();

        if (idade >= 18 && idade <= 35 && altura >= 165 && peso <= 100) {
            System.out.println("Você pode testar o avião!");
        } else {
            System.out.println("Você não pode testar o avião...");
        }
    }

}
