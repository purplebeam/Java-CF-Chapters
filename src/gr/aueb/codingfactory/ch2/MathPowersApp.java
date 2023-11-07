package gr.aueb.codingfactory.ch2;

import java.util.Scanner;

public class MathPowersApp {
    public MathPowersApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please insert an init");
        num = scanner.nextInt();
        System.out.printf("num = %d, num^2 = %d, num^3 = %d", num, (int)Math.pow((double)num, 2.0), (int)Math.pow((double)num, 3.0));
    }
}
