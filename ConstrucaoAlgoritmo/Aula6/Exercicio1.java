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
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 1;
        int soma = 0;
        int valor = 0;
        do {
            System.out.println("Digite um valor para media");
            valor = scan.nextInt();
            if (valor > 0) {
                soma += valor;
                cont++;
            } else {
                break;
            }

        } while (valor > 0);
        cont--;
        System.out.println("A media é: " + (soma / cont));

    }

}
