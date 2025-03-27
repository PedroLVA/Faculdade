package Aula3;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scan.nextInt();
        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        System.out.println("Os numeros em ordem crescente são:");
        System.out.println("Menor: " + num1);
        System.out.println("Meio: " + num2);
        System.out.println("Maior: " + num3);

    }

}
