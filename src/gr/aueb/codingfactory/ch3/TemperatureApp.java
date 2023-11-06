package gr.aueb.codingfactory;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isTempBellowZero = true;
        int temp = 0;

        System.out.println("Please Insert current temperature: ");
        temp = scanner.nextInt();

        if (isTempBellowZero && temp<=0) {
            System.out.printf("Warning Temperature is below zero!\nCurrent Temp: %d",temp);

        }
    }
}
