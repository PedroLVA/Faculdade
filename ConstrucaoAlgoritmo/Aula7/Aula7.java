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
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numEscolha = 0;
        int numOperacao = 0;
        int guardaNum = 0;
        int count = 0;
        int max = 0;
        int sum = 0;
        while (numEscolha != 2) {
            System.out.println("Digite 1 para digitar um numero e 2 para parar");
            numEscolha = scan.nextInt();
            if (numEscolha == 2) {
                System.out.println("Você finalizou...");
                break;
            } else if (numEscolha == 1) {
                System.out.println("Certo, digite um numero agora: ");
                numOperacao = scan.nextInt();
                sum += numOperacao; //isso cuida da media
                count++;
                if (count > 1 && numOperacao >= guardaNum) {
                    max = numOperacao;
                }
                guardaNum = numOperacao;
            }
        }
        System.out.println("Média: " + (sum / count));
        System.out.println("Max: " + max);
    }

}
