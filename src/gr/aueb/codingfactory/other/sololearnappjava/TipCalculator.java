package gr.aueb.codingfactory.other.sololearnappjava;

import java.util.Scanner;

/*
You always tip 15% of the bill amount.
To make the calculation easier, you decide to write a program that will do that for you.

Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.

To calculate 15% of a number, multiply it by 15, then divide it by 100.

The input amount can be a decimal, so take a double from the input.
 */
public class TipCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Bill Amount: ");
        double billAmount = scanner.nextDouble();
        double correspondingTip = billAmount*0.15;

        System.out.println("The tip is: " + correspondingTip);
    }

}
