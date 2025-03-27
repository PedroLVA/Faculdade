package Aula2;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos cavalos ce tem ai?: ");
        int qtdCavalo;
        qtdCavalo = scan.nextInt();
        
        int qtdFerradura = qtdCavalo * 4;
        
        System.out.println("============");
        System.out.println("Então ce precisa de " + qtdFerradura + " ferraduras...");

    }

}
