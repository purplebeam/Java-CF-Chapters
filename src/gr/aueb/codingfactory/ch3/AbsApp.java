package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num1 = in.nextInt();

        abs = (num1 > 0) ? num1 : -num1;

        System.out.printf("Abs of %d is: %d",num1,abs);
    }
}
