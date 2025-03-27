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
public class exemploOu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Você está de folga?: ");
        boolean folga = scan.nextBoolean();
        
        System.out.println("Tem sol?: ");
        boolean sol = scan.nextBoolean();
        
        if(sol && folga){
            System.out.println("Irei passear hoje!");
        }else{
            System.out.println("Não irei passear hoje");
        }
        
    }
    
}
