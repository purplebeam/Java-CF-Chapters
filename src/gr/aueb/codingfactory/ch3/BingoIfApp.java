package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class BingoIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;
        final int SECRET = 11;

        do {
            System.out.println("Please guess the key number");
            inputNum = in.nextInt();


            if (inputNum == key) {
                System.out.println("Bingo!");
                bingo = true;
            } else if (inputNum == SECRET) {
                System.out.println("Bingo! SECRET KEY ACTIVATED!");
                break;
            } else {
                System.out.println("Try Again!");
            }
        }while (!bingo);
    }
}
