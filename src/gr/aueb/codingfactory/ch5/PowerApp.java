package gr.aueb.codingfactory.ch5;

import java.util.Scanner;

/**
 * Power a^n Demo made with method.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int n = 0;
        int result = 0;

        System.out.println("Please insert base and power: ");
        base = in.nextInt();
        n = in.nextInt();

        result = pow(base, n);

        System.out.printf("%d^%d = %d", base, n, result);


    }

    /**
     * @param base is the base.
     * @param n    is the power.
     * @return is the result.
     */
    public static int pow(int base, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= base;
//            System.out.printf("%d^%d = %d\n", base, i, result); // Testing Method Output
        }
        return result;
    }
}
