package ExerciciosAula4;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPar = 0;
        int countImpar = 0;
               
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite um numero qualquer");
            int numero = scan.nextInt();
            int par = numero % 2;
            if(par == 0){
                countPar++;
            }
            else{
                countImpar++;
            }
        }
        System.out.println("Quantidade numero par: " + countPar);
        System.out.println("Quantidade numero impar: " + countImpar);
    }

}
