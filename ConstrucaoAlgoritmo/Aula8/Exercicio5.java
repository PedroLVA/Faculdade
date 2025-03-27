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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha = 0;
        int valor = 0;
        int sum = 0;
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Da " + (i + 1) + " linha digite a " + (j + 1) + " coluna");
                valor = scan.nextInt();
                matriz[i][j] = valor;
            }
        }
        System.out.println("-------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Escolha uma linha para ver a média: ");
        escolha = scan.nextInt();
        
        for (int i = escolha; i <= escolha; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }
        System.out.println("A media dessa linha é: " + (sum/3));
    }

}
