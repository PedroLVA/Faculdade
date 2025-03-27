package Aula2;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quantidade de pontos do líder do campeonato brasileiro de futebol: ");
        double qtdLCB = scan.nextInt();

        System.out.println("quantidade de pontos do time lanterna: ");
        double qtdL = scan.nextInt();

        //processamento
        double vitoria = (int) Math.ceil((qtdLCB - qtdL)/3);
       

        //Expressão math ceil para arredondar para o próximo número inteiro
        

        System.out.println("O time lanter precisa de " + vitoria + " vitórias.");
    }

}
