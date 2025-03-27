package Aula3;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual foi sua nota na prova?");
        int nota = scan.nextInt();

        if (nota >= 7) {
            System.out.println("Você foi aprovado, parabens!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Você está de recuperação");
        }
        else{
            System.out.println("Você está reprovado!");
        }
    }

}
