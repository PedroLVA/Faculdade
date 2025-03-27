/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = scan.nextDouble();

        if (numero < 0) {
            System.out.println("O numero é negativo");
        } else if (numero > 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("Zero");
        }

    }

}
