package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class SumNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <=n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
