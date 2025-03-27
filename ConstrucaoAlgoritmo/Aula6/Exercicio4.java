/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main_1.java to edit this template
 */
package Aula6;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 1;
        int qtd = 0;
        int soma = 0;
        while (num != 0) {
            System.out.println("Insira numero par para calcular a media");
            System.out.println("Pressione [0] para sair");
            num = scan.nextInt();
            soma += num;
            if (num == 0) {
                System.out.println("Você finalizou o programa!");
                break;
            } else if (num % 2 != 0) {
                System.out.println("Você digitou um numero impar!");
                soma -= num;
                qtd--;
                qtd++;
                continue;
            }
            qtd++;
        }
         System.out.println("A média é: " + (soma/qtd));

    }
}
