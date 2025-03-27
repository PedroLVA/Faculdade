/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosAula4;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
            if (i == 1) {
                System.out.println(i + "+" + "0" + " = " + soma);
            } else {
                System.out.println(soma - i + "+" + i + " = " + soma);
            }
        }
    }

}
