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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        int[][] matriz = new int[3][3];
        int[][] doubleMatriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Da " + (i + 1) + " linha digite a " + (j + 1) + " coluna");
                valor = scan.nextInt();
                matriz[i][j] = valor;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               doubleMatriz[i][j] = (matriz[i][j]*2);
            }
        }
        System.out.println("-------------");
        for (int i = 0; i < doubleMatriz.length; i++) {
            for (int j = 0; j < doubleMatriz[i].length; j++) {
                System.out.print(doubleMatriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
