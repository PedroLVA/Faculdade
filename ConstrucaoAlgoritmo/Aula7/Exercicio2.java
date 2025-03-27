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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numeros = new double[10];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + " numero: ");
            numeros[i] = scan.nextDouble();
        }
        
        System.out.println("Aqui estão os numeros de tras para frente: ");
        for(int i = 9; i >= 0; i--){
            
            System.out.println((i + 1) + " numero: " + numeros[i]);
        }
        
    }
    
}
