package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class MinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        System.out.printf("The min value between %d and %d is: %d\n",num1,num2,min);
    }
}
