package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = scanner.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining ||  (isDark || isRunning);

        System.out.println("Lights On: " + lightsOn);
        System.out.printf("Raining: %b\nDark: %b\nRunning: %b\n",isRaining,isDark,isRunning);

    }
}
