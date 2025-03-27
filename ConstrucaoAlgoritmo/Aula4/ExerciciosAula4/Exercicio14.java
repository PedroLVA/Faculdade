package ExerciciosAula4;

import java.math.BigInteger;

public class Exercicio14 {

    public static void main(String[] args) {

        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;

        for (int i = 1; i <= 100; i++) {
            BigInteger n = num1.add(num2);
            num1 = num2;
            num2 = n;
            System.out.print(n + " ");
        }
    }

}
