package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a num (-1 for Quit)");
        num = in.nextInt();
        while (num != -1){
            iterations++;
            System.out.println("Please provide a num");
            num = in.nextInt();
        }
        System.out.printf("%d iterations",iterations);
    }
}
