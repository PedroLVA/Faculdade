/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int count = 0;
        int[] notas = new int[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a " + (i + 1) + " nota: ");
            notas[i] = scan.nextInt();
        }
        System.out.println("Suas notas são: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A" + (1+i) + " nota é: " + notas[i]);
            soma += notas[i];
            count++;
        }
        System.out.println("Sua média é: " + soma / count);
    }

}
