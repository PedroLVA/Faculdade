/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosAula4;

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
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan2.nextLine();
        
        System.out.println("---------------------");
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        for (int i = 1; i <= numero; i++ ){
            System.out.println(i + ")" + nome);
        }
    }
    
}
