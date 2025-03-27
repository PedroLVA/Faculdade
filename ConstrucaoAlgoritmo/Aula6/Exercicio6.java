package Aula6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int soma = 0;
        while (num != 0) {
            System.out.println("Digite um numero para ver a somatoria! Digite [0] para termianr");
            num = scan.nextInt();

            if (num == 0) {
                System.out.println("Você digitou 0, terminando...");
                break;
            }
            if (num < 0) {
                soma += num;
            } else {
                System.out.println("Você digitou um numero positivo! n?o funciona assim");
            }
        }
        System.out.println("A soma dos numeros negativos é: " + soma);
    }

}
