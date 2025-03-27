/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas vezes queres escrever o número? ");
        int vezes = scan.nextInt();
        int dentro = 0;
        int invalido = 0;

        for (int i = 1; i <= vezes; i++) {
            System.out.println(i + ") Digite um numero: ");
            int numero = scan.nextInt();
            if (numero >= 10 && numero <= 20) {

                System.out.println("O numero digitado foi: " + numero);
                dentro++;

            } else {

                System.out.println("## NUMERO INVALIDO ##");
                invalido++;
            }
            System.out.println("-----------------------------------");

        }
        System.out.println("Números validos: " + dentro);
        System.out.println("Números invalidos: " + invalido);
    }

}
