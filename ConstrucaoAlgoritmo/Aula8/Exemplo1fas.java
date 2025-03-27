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
public class Exemplo1fas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        matriz[0][0] = 100;
        matriz[1][1] = 200;
        matriz[2][2] = 300;

        int matriz2[][]
                = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};
        Scanner scan = new Scanner(System.in);
        int matriz3[][] = new int[3][3];
        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
                System.out.println("Digite o numero da matriz");
                matriz3[linha][coluna] = scan.nextInt();
            }
        }
        //---------------------------------------------
        System.out.println("Sua matriz: ");
        for (int linha = 0; linha < matriz3.length; linha++) {
            
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
                System.out.print(matriz3[linha][coluna] + " ");
            }
            System.out.println(" ");
        }
    }

}
