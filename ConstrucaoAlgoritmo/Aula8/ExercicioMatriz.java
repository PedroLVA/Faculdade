/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0106;

/**
 *
 * @author aluno
 */
public class ExercicioMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriz2 = {{10,20,33},{40,50,60},{70,80,90}};
        int[][] matrizSoma = new int[3][3];
        
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                matrizSoma[i][j]= matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("Sua matriz 1: ");
        for (int linha = 0; linha < matriz1.length; linha++) {
            
            for (int coluna = 0; coluna < matriz1[linha].length; coluna++) {
                System.out.print(matriz1[linha][coluna] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Sua matriz 2: ");
        for (int linha = 0; linha < matriz2.length; linha++) {
            
            for (int coluna = 0; coluna < matriz2[linha].length; coluna++) {
                System.out.print(matriz2[linha][coluna] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Sua matriz 3: ");
        for (int linha = 0; linha < matrizSoma.length; linha++) {
            
            for (int coluna = 0; coluna < matrizSoma[linha].length; coluna++) {
                System.out.print(matrizSoma[linha][coluna] + " ");
            }
            System.out.println(" ");
        }

        
        
    }
    
}
