package dev.avyguzov.timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1243 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String N = s.nextLine();
        BigInteger bI = new BigInteger(N);
        System.out.println(bI.divideAndRemainder(BigInteger.valueOf(7))[1]);
    }
}
