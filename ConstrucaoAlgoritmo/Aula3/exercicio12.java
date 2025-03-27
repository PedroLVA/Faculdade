package Aula3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Digite o preço total da compra: ");

            try {
                valor = scan.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido!");
                scan.nextLine();
            }
        }

        scan.nextLine();

        System.out.println("------------------------------------");
        System.out.println("Agora escolha o método de pagamento");
        System.out.println("1: Dinheiro; 2: Credito; 3: Debito");
        int escolha = scan.nextInt();
        double valorfinal = 0;

        if (escolha == 1) {
            valorfinal = valor * 0.95;
        } else if (escolha == 2) {
            valorfinal = valor * 1.10;
        } else if (escolha == 3) {
            valorfinal = valor;
        }

        System.out.println("O valor final da compra é: " + valorfinal);
    }

}
