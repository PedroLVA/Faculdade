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
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual tabuada que o senhor quer???: ");
        int tabuada = scan.nextInt();
        
        
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada*i);
        }
    }
    
}
