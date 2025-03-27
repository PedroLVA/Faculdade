
package Aula2;

import java.util.Scanner;


public class MultiplicacaoAquecer {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número qualquer: ");
        double pNumero = scan.nextDouble();
        
        System.out.println("-----------");
        
        System.out.print("Agora outro numero aleatorio: ");
        double sNumero = scan.nextDouble();
        
        double resultado = pNumero * sNumero;
        
        System.out.println("A multiplicação entre esses 2 numeros é: " + resultado);
    }
    
}
