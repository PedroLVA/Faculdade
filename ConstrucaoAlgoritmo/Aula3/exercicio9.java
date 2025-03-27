package Aula3;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        if (idade < 12) {
            System.out.println("Então você é uma criança!");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto!");
        } else {
            System.out.println("Você é um idoso!");
        }
    }

}
