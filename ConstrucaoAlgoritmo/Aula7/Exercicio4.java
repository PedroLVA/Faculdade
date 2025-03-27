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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mult = 1;
        int soma = 0;
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            nums[i] = scan.nextInt();
            soma += nums[i];
            mult *= nums[i];
        }
        
        for (int i = 0; i < nums.length; i++){
            System.out.println("O " + (1 + i) + " numero é: " + nums[i]);
        }
        System.out.println("----------------------");
        System.out.println("A soma é: " + soma);
        System.out.println("A multiplicacao é: " + mult);
    }

}
