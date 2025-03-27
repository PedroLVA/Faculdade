
package ExerciciosAula4;

import java.util.Scanner;


public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo para ver a taboada: ");
        int numero = scan.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + " = " + numero*i);
        }
    }

}
