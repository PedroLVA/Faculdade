
package Aula2;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite o valor do produto: ");
        float valorProd = scan.nextFloat();
        
        System.out.println("Agora digite o valor do desconto do produto: ");
        float valorDesc = scan.nextFloat();
        
        //Processamento
        valorDesc = valorProd * (valorDesc/100);
        float valorProdDesc = valorProd - valorDesc;
        
        System.out.println("O valor do desconto é: "+ "R$"+ valorDesc);
        System.out.println("=================================");
        System.out.printf("O valor do produto com desconto é: R$%.2f", valorProdDesc);
    }

}
