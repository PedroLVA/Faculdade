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
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Diga a medida de um dos lados do retangulo: ");
        double lado1 = scan.nextDouble();
        
        System.out.println("---------------");
        
        System.out.println("Agora diga a medida da base: ");
        double lado2 = scan.nextDouble();
        
        double area = lado1*lado2;
        
        System.out.println("A area do retangulo é: " + area);
    }
    
}
