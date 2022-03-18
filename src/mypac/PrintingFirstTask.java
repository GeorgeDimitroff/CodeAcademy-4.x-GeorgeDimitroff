package mypac;

/*
Дефинирайте променливи със стойност -250, 250, 4 589 498, 10 000 000 000 000 000 000, -9 000 000 000 000 000 000.
Изведете всяка променлива на екрана със println()
 */

import java.math.BigInteger;

public class PrintingFirstTask {
    public static void main(String[] args) {
        int num1 = -250;
        int num2 = 250;
        int num3 = 4589498;
        BigInteger num4 = new BigInteger("10000000000000000000");
        long num5 = -9000000000000000000L;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
