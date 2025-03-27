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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (1+ i) + " numero: ");
            numeros[i] = scan.nextInt();
        }
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("O "+(i+1) + " numero é: " + numeros[i]);
        }
    }
    
}
