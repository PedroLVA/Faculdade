/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0106;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio2fas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        int[] vetor = new int[10];
        int[] vetor2 = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            valor = scan.nextInt();
            vetor[i] = valor;
            vetor2[9 - i] = vetor[i];
        }
        //-----------------------------------------//
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]" + " ");
        }
        System.out.println("\n----------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor2[i] + "]" + " ");
        }
        System.out.println("\n----------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == vetor2[i]) {
                System.out.println("O numero " + vetor[i] + " encontra-se igual no index " + i);
            }
        }
    }

}
