package gr.aueb.codingfactory.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateToSecondsApp {
    public DateToSecondsApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        int SECS_PER_HOUR = 3600;
        int SECS_PER_MIN = 60;
        System.out.println("Please insert hours, minutes, seconds (ints): ");
        inputHours = scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();
        totalSeconds = inputHours * 3600 + inputMinutes * 60 + inputMinutes;
        System.out.printf(Locale.forLanguageTag("el-GR"), "%02d hours, %02d minutes, %02d seconds, are total seconds: %,d", inputHours, inputMinutes, inputSeconds, totalSeconds);
    }
}
