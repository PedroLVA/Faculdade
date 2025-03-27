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
public class ExemploVetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cidades = new String[5];
        System.out.println("Digite os nomes das cidades!");

        for (int i = 0; i < cidades.length; i++) {
            System.out.print((i + 1) + ": ");
            cidades[i] = scan.nextLine();

        }
        System.out.println("-------------------------");
        System.out.println("Voce digitou as cidades: ");
        for (int i = 0; i < cidades.length; i++) {

            System.out.println((i + 1) + ": " + cidades[i]);
        }
    }

}
