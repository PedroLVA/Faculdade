/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int escolha = 1;
        int escolha2 = 1;
        int index = 0;
        int countItems = 1;
        int verifica1 = 0;
        int verifica2 = 0;
        int verifica3 = 0;
        int verifica4 = 0;
        int verifica5 = 0;
        double soma = 0;
        Scanner scan = new Scanner(System.in);
        String[] nomeProduto = {"Chocolate", "Arroz", "Feijão", "Mandioca", "Carne"};
        String[] produtosEscolhidos = new String[nomeProduto.length];
        double[] precoProduto = {5, 10, 8, 5, 50};

        while (escolha != 0) {
            escolha2 = 1;
            if (countItems > 5) {
                break;
            }
            System.out.println("=======Bem vindo ao Supermercado!=======");
            for (int i = 0; i < nomeProduto.length; i++) {
                System.out.print("[" + (i + 1) + "]" + nomeProduto[i] + " |" + " ");
                System.out.println("R$ " + precoProduto[i]);
            }
            System.out.println("Digite qualquer numero para adicionar um produto ao carrinho ou 0 para sair");
            escolha = scan.nextInt();

            if (escolha == 0) {
                System.out.println("Você terminou...");
                break;
            }

            while (escolha2 != 0) {

                if (countItems > 5) {
                    System.out.println("Você colocou o estoque inteiro no carrinho!");
                    break;
                }
                System.out.println("Escolha o " + countItems + " item ou digite [0] para parar");
                escolha2 = scan.nextInt();

                if (escolha2 == 0) {
                    System.out.println("Você parou de escolher");
                    break;
                }
                switch (escolha2) {
                    case 1:
                        if (verifica1 == 1) {
                            System.out.println("Você já colocou este item!");
                            countItems--;
                            break;
                        }
                        produtosEscolhidos[index] = nomeProduto[escolha2-1];
                        soma += precoProduto[escolha2-1];
                        verifica1++;
                        break;
                    case 2:
                        if (verifica2 == 1) {
                            System.out.println("Você já colocou este item!");
                            countItems--;
                            break;
                        }
                        produtosEscolhidos[index] = nomeProduto[escolha2-1];
                        soma += precoProduto[escolha2-1];
                        verifica2++;
                        break;
                    case 3:
                        if (verifica3 == 1) {
                            System.out.println("Você já colocou este item!");
                            countItems--;
                            break;
                        }
                        produtosEscolhidos[index] = nomeProduto[escolha2-1];
                        soma += precoProduto[escolha2-1];
                        verifica3++;
                        break;
                    case 4:
                        if (verifica4 == 1) {
                            System.out.println("Você já colocou este item!");
                            countItems--;
                            break;
                        }
                        produtosEscolhidos[index] = nomeProduto[escolha2-1];
                        soma += precoProduto[escolha2-1];
                        verifica4++;
                        break;
                    case 5:
                        if (verifica5 == 1) {
                            System.out.println("Você já colocou este item!");
                            countItems--;
                            break;
                        }
                        produtosEscolhidos[index] = nomeProduto[escolha2-1];
                        soma += precoProduto[escolha2-1];
                        verifica5++;
                        break;
                    default:
                        System.out.println("Digite uma opção valida!");
                        countItems--;
                }
                index++;
                countItems++;

            }
        }
        System.out.println("Os items que você colocou no carrinho: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + (i + 1) + "]" + produtosEscolhidos[i] + " ");

        }
        System.out.println("\nPreco total da compra: " + soma);

    }

}
