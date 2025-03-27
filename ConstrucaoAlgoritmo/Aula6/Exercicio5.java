package Aula6;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        while (num > 0) {
            System.out.println("Digite um numero, este software irá contar intervalos!!");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Você digitou um numero negativo, finalizando...");
                break;
            }
            if (num >= 0 && num < 25) {
                cont1++;
            } else if (num >= 25 && num <= 50) {
                cont2++;
            } else if (num >= 50 && num <= 75) {
                cont3++;
            } else if (num >= 75 && num <= 100) {
                cont4++;
            }

        }
        System.out.println("Entre 0 e 25: " + cont1);
        System.out.println("Entre 25 e 50: " + cont2);
        System.out.println("Entre 50 e 75: " + cont3);
        System.out.println("Entre 75 e 100: " + cont4);
    }
}
