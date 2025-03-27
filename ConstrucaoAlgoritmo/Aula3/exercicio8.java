package Aula3;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a temperatura atual?");
        int resposta = scan.nextInt();

        if (resposta <= 15) {
            System.out.println("Então está frio!");
        } else if (resposta > 15 && resposta <= 30) {
            System.out.println("Então está morno!");
        } else {
            System.out.println("Então está quente!");
        }
        scan.close();
    }

}
