package gr.aueb.codingfactory.ch5;

import java.util.Scanner;

public class EvenOrOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        System.out.println("Please insert num: ");
        num = scanner.nextInt();

        if (isEven(num)){
            System.out.printf("Num: %d is Even",num);
        }

        if (isOdd(num)){
            System.out.printf("Num: %d is Odd",num);
        }

    }

    /**
     *
     * @param num the number to check if it's Even
     * @return returning result to main.
     */
    public static boolean isEven(int num){
        return (num % 2 == 0);
    }

    /**
     *
     * @param num the number to check if it's Odd
     * @return returning result to main.
     */
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }


}
