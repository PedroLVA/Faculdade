package Aula6;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double idadeGrupo = 0.0;
        double altMulher = 0.0;
        double altHomem = 0.0;
        double somaAltMulher = 0.0;
        double idadeHomens = 0.0;
        double per18e35 = 0.0;
        int idade = 0;
        int sexo = 0;
        int count = 0;
        int countMulher = 0;
        int countHomem = 0;

        while (count <= 1000) {
            count++;
            if (count > 1000) {
                count--;
                break;
            }

            System.out.println(count + ") Digite seu sexo: [0] Feminino | [1] Masculino");
            sexo = scan.nextInt();

            switch (sexo) {
                case 0:
                    System.out.println(count + ") Digite sua idade");
                    idade = scan.nextInt();
                    if (idade >= 18 && idade <= 35) {
                        per18e35++;
                    }
                    idadeGrupo += idade;
                    System.out.println(count + ") Digite sua altura em cm: ");
                    altMulher = scan.nextDouble();
                    somaAltMulher += altMulher;
                    countMulher++;
                    break;

                case 1:
                    System.out.println(count + ") Digite sua idade");
                    idade = scan.nextInt();
                    if (idade >= 18 && idade <= 35) {
                        per18e35++;
                    }
                    idadeHomens += idade;
                    idadeGrupo += idade;
                    System.out.println(count + ") Digite sua altura em cm: ");
                    altHomem = scan.nextDouble();
                    countHomem++;
                    break;
            }

        }
        System.out.println("média da idade do grupo: " + (idadeGrupo / count));
        System.out.println("média da altura das mulheres: " + (somaAltMulher / countMulher));
        System.out.println("média da idade dos homens: " + (idadeHomens / countHomem));
        System.out.println("Percentual de pessoas com idade entre 18 e 35 anos: " + (per18e35 / count) * 100 + "%");

    }

}
