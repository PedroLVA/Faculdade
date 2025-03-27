/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main_1.java to edit this template
 */

package Aula6;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exemplo6 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isReady = true;
        int opt = 0;
        
        do{
            System.out.println("Quer sair? Digite 2");
            opt = scan.nextInt();
            
            if(opt == 2){
                isReady = false;
            }
        }while(isReady);
    }

}
