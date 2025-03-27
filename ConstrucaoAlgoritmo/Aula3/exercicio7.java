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
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println("O primeiro numero é maior!");
        }
        else{
            System.out.println("O segundo numero é maior!");
        }
    }
    
}
