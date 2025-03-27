package Aula2;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Nome;
        String Endereco;
        String Telefone;
        String Area;

        System.out.print("Informe seu nome: \n");
        Nome = scan.nextLine();

        System.out.print("Agora informe seu endereço: \n");
        Endereco = scan.nextLine();

        System.out.print("Agora informe seu numero de telefone: \n");
        Telefone = scan.nextLine();

        System.out.print("Por ultimo, informe sua área de atuação profissional: \n");
        Area = scan.nextLine();

        System.out.println("======================");
        System.out.println("Seu Nome: " + Nome);
        System.out.println("Seu Endereço: " + Endereco);
        System.out.println("Seu Telefone: " + Telefone);
        System.out.println("Sua área de atuação: " + Area);

    }

}
