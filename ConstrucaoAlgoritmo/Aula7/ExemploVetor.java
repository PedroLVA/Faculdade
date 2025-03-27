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
public class ExemploVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[10];
        nomes[0] = "Fabio";
        nomes[1] = "Darth Vader";
        nomes[9] = "Homem Aranha";

        System.out.println("No indice 0, temos o nome " + nomes[0]);
        System.out.println("No indice 1, temos o nome " + nomes[1]);
        System.out.println("No indice 2, temos o nome " + nomes[2]);
        System.out.println("No indice 9, temos o nome " + nomes[9]);

        int[] valores = {11, 85, 18, 14, 24};
        System.out.println(valores[2]);

        valores[3] = 100; //altera o valor de tal indice

        //============================//
        String[] eventos = {"Teatro", "Cinema", "Show", "Yoga"};

        for (int i = 0; i < eventos.length; i++) {
            System.out.println((i + 1) + " - " + eventos[i]);
        }
        
    }

}
