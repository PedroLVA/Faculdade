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
public class Numsei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o username: ");
        String username = scan.nextLine();
        
        System.out.println("Digite a senha: ");
        String senha = scan.nextLine();
        
        if(senha.equals("123456")){
            System.out.println("Olá " + username + ", Você tem permissão!!");
        }
        else{
            System.out.println("Você não tem permissão");
        }
        
      
    }
    
}
