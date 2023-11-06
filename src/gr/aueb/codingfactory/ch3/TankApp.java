package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class TankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;
        boolean isGreen = false;

        System.out.println("Please insert tank status (true/false)");
        System.out.println("Tank 1 status: ");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Tank 2 status: ");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 & isEmptyTank2;
        isGreen = !isEmptyTank1 && !isEmptyTank2;

        System.out.println("Orange: " + isOrange + ", " + "Red: " + isRed + " Green: " + isGreen);
    }
}
