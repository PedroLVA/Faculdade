package Aula6;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int idade = 0;
        int somaIdade = 0;
        int peso = 0;
        int count90 = 0;
        while (count <= 7) {
            count++;
            if (count > 7) {
                count--;
                break;  
            }
            
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            somaIdade += idade;
            
            System.out.println("------------------");
            System.out.println("Agora digite seu peso em KG: ");
            peso = scan.nextInt();
            
            if(peso > 90){
                count90++;
            }
        }
        
        System.out.println("Média das idades: " + (somaIdade/count));
        System.out.println("Numero de pessoas acima de 90kg: " + count90);
    }

}
