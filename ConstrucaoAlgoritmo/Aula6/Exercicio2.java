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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isNull = true;
        boolean cancelou = false;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int contNull = 0;
        int contBranco = 0;
        do {
            System.out.println("===========================");
            System.out.println("[1]candidato 1 | [2]candidato 2 | [3]candidato 3 | [4]Candidato 4 | [5] Nulo | [6] Branco ");
            System.out.println("===========================");
            System.out.println("Escolha um cadidato!!");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Você cancelou!");
                    cancelou = true;
                    isNull = false;
                    break;
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    contNull++;
                    break;
                case 6:
                    contBranco++;
                    break;
            }

        } while (isNull);
        if(cancelou == false){
            System.out.println("Quantidade votos Candidato 1: " + cont1);
        System.out.println("Quantidade votos Candidato 2: " + cont2);
        System.out.println("Quantidade votos Candidato 3: " + cont3);
        System.out.println("Quantidade votos Candidato 4: " + cont4);
        System.out.println("Quantidade votos nulo: " + contNull);
        System.out.println("Quantidade votos brancos: " + contBranco);
        }
        
    }

}
