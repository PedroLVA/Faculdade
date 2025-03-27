
package aula0405;

import java.util.Scanner;


public class Aula0405 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite algo");
        int idade = scan.nextInt();
        
        
        switch(idade){
            case 1:
                System.out.println(idade);
                break;
            case 2:
                System.out.println("cuanusnuususu");
                break;
            default:
                System.out.println("anusnusnus");
                break;
        }
    }
    
}
