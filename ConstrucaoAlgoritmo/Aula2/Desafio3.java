
package Aula2;

import java.util.Scanner;


public class Desafio3 {

    
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner scan = new Scanner(System.in);
        //entrada
        System.out.print("Digite um número: \n");
        num1 = scan.nextFloat();
        System.out.print("Agora digite outro número: \n");
        num2 = scan.nextFloat();
        
        //processamento
        float soma = num1 + num2;
        float div = num1 / num2;
        float mult = num1 * num2;
        float sub = num1 - num2;
        
        //saida
        System.out.print("A soma dos números é:" + soma + "\n");
        System.out.print("A subtração dos números é: " + sub + "\n");
        System.out.print("A divisão dos números é: " + div + "\n");
        System.out.print("A multiplicação dos números é: " + mult + "\n");
    }

}
