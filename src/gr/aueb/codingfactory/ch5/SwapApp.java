package gr.aueb.codingfactory.ch5;

import java.util.Scanner;

/**
 *  Μεταθέτει αμοιβαία δύο τιμές
 */
public class SwapApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 1;

        System.out.println("Give me a and b for swap: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        swap(a,b);
    }

    /**
     *
     * @param a variable to swap to b
     * @param b variable to swap to a
     */
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
