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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ") Digite um número: ");
            int num = scan.nextInt();
            soma += num;

        }
        System.out.println(soma);
    }

}
