/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula3;

public class exemploElseIf {

    public static void main(String[] args) {
        int idade = 18;
        String nome = "Maria";

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos e pode acessar!!");
        } else if (nome.equals("Maria")) {
            System.out.println("Você é a Maria e pode acessar!");
        } else {
            System.out.println("Você não pode acessar");
        }
    }

}
