package ExerciciosAula4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de vezes: ");
        int n = scan.nextInt();
        int inicial = 1;
        float continua = 0f;
        DecimalFormat df = new DecimalFormat("#.#");

        for (float i = 1f; i <= n; i++) {
            float operacao = inicial / i;

            continua += operacao;
            if( i < n){
                System.out.print(inicial + "/" + (df.format(i)) + " + ");
            }
            else{
                System.out.print(inicial + "/" + (df.format(i)));
            }
                
        }
        System.out.println(" = " + continua);
    }

}
