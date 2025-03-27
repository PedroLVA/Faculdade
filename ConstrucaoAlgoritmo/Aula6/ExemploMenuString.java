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
public class ExemploMenuString {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        String decisao = "nada";
        while(!decisao.equals("Sair")){
            System.out.println("Escolha \n Cadastrar, Editar, Apagar ou Sair");
            decisao = scan.nextLine();
            
            switch(decisao){
                case("Cadastrar"):
                    System.out.println("Cadastrando...");
                    System.out.println("===============");
                    break;
                case("Editar"):
                    System.out.println("Editando...");
                    System.out.println("==================");
                    break;
                case ("Apagar"):
                    System.out.println("Apagando...");
                    System.out.println("========================");
                    break;
            }
        }
    }

}
