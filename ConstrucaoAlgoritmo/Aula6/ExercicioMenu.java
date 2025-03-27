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
public class ExercicioMenu {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean isReady = true;
        
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("1) cadastrar \n2) sair");
            int opt = scan.nextInt();
            
           
            
                switch(opt){
                case 1:
                    System.out.println("Cadastrando!!");
                    System.out.println("=========");
                    break;
                    
                case 2:
                    System.out.println("Saindo...");
                    isReady = false;
                    break;
                default:
                    System.out.println("Digite algo valido!!");
            }
            
            
        }while(isReady);
    }

}
