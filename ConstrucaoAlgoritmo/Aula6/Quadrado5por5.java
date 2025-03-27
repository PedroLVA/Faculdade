/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main_1.java to edit this template
 */
package Aula6;

/**
 *
 * @author aluno
 */
public class Quadrado5por5 {

    public static void main(String[] args) {

        int valor = 1;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(valor + " ");
                valor++;

            }
            System.out.println("");
        }
    }

}
