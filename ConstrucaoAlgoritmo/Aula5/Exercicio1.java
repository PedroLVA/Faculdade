/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0405;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        float num1 = scan.nextFloat();

        System.out.println("Digite outro numero");
        float num2 = scan.nextFloat();

        System.out.println("=======================");

        System.out.println("Digite: \n [1] para somar \n [2] para subtrair \n [3] para multiplicar \n [4] para dividir");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O resultado da soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("O resultado da subtracao é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("O resultado da multiplicacao é: " + (num1 * num2));
                break;
            case 4:
                System.out.println("O resultado da divisao é: " + (num1 / num2));
                break;
            default:
                System.out.println("Escolha uma operacao valida!!!!");

        }

    }

}
