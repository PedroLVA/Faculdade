import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = 1;
        double preco = 0.0;
        double precoNovo = 0.0;
        double somaPreco = 0.0;
        double somaPrecoNovo = 0.0;
        int qtdProd = 0;

        while(codigo > 0){
            System.out.print("Digite o código do produto (ou um número negativo para sair): ");
            codigo = scan.nextInt();

            if (codigo < 0) {
                System.out.println("Terminando...");
                break;
            }
            System.out.print("Digite o preço de custo do produto: ");
                preco = scan.nextDouble();

                precoNovo = preco * 1.2;
                somaPreco += preco;
                somaPrecoNovo += precoNovo;
                qtdProd++;

                System.out.println("Produto " + codigo + " - Preço novo: R$" + precoNovo);
        } 

        double mediaPrecoCusto = somaPreco / qtdProd;
        double mediaPrecoNovo = somaPrecoNovo / qtdProd;

        System.out.println("Média de preços sem aumento: R$" + mediaPrecoCusto);
        System.out.println("Média de preços com aumento: R$" + mediaPrecoNovo);
    }
}