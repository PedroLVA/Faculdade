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
public class Aula0106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int sum = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            int numEscolhido = scan.nextInt();
            if (numEscolhido < 0) {
                System.out.println("O numero nao pode ser negativo");
                i--;
            } else {
                numeros[i] = numEscolhido;
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
        for (int i = 0; i < numeros.length; i += 2) {
            sum += numeros[i];
        }
        System.out.println("\nO resultado da soma é: " + sum);
        

    }

}
