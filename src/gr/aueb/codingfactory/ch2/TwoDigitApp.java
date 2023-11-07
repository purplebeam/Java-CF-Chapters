package gr.aueb.codingfactory.ch2;

import java.util.Scanner;

public class TwoDigitApp {
    public TwoDigitApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int leftMost = 0;
        int rightMost = 0;
        int sum = 0;
        int sumOfSquares = 0;
        System.out.println("Please insert a num (int): ");
        num = scanner.nextInt();
        leftMost = num / 10;
        rightMost = num % 10;
        sum = leftMost + rightMost;
        sumOfSquares = (int)Math.pow((double)leftMost, 2.0) + (int)Math.pow((double)rightMost, 2.0);
        System.out.printf("Number: %d, Sum of digits: %d, Sum of squares of digits: %d\n", num, sum, sumOfSquares);
    }
}
