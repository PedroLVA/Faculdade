/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0405;


import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scan.nextLine();
        
        switch(letra){
            case "a":
                System.out.println("Abacaxi");
                break;
            case "m":
                System.out.println("Morango");
                break;
            case "p":
                System.out.println("Pera");
                break;
            default:
                System.out.println("Letra invalida");
                
                
        }
        
    }
    
}
