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
public class ExercicioSenha {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a senha");
        String senha = scan.nextLine();
        
        boolean entrar = senha.equals("123") ? true : false;
        
        if(entrar == true){
            System.out.println("Você pode entrar");
        }
        else{
            System.out.println("Você não pode entrar!!!!");
        }
        
        System.out.println(entrar);
    }

}
