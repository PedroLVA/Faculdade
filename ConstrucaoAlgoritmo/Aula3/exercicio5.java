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
public class exercicio5 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Me de um número qualquer: ");
        int numero = scan.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
    
}
