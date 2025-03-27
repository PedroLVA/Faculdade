/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        
        System.out.println("O sucessor é: " + sucessor + " e o antecessor é: " + antecessor);
    }
    
}
