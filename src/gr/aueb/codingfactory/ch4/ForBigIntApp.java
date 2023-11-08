package gr.aueb.codingfactory.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *  Χρησιμοποιεί την κλάση BigInteger
 */
public class ForBigIntApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i=1; i<= n; i++){
            result = result.multiply(BigInteger.valueOf(a)); // variable.method(class.method(input a))
        }

        System.out.println("Result: " + result);

    }
}
