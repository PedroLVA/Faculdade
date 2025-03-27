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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Diga o seu nome: ");
        String nome = scan.nextLine();
        
        for(int i = 1; i<=10; i++){
        System.out.println("O nome do usuário é: " + nome);
    }
    }
    
}
