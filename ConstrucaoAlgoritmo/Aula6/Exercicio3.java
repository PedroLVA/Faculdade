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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod = 1;
        int soma = 0;

        while (cod != 0) {
            System.out.println("Insira o codigo do aluno ou digite 0 para sair!");
            cod = scan.nextInt();

            if (cod == 0) {
                System.out.println("Você finalizou o programa!");
                break;
            }
            for (int i = 1; i <= 3; i++) {
                int nota = 0;

                System.out.println("Digite a " + i + "° nota do aluno de codigo " + cod);
                nota = scan.nextInt();
                if(nota > 10 || nota < 0){
                    System.out.println("Digite uma nota valida!!");
                    System.out.println("=======================");
                    i--;
                    continue;
                }
                else{
                    soma += nota;
                }
                
            }
            System.out.println("A nota do aluno de codigo " + cod + " é: " + (soma / 3));
            System.out.println("===================================");
        }

    }
}
