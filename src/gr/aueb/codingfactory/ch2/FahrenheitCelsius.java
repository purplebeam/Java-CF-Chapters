package gr.aueb.codingfactory.ch2;

import java.util.Scanner;

public class FahrenheitCelsius {
    public FahrenheitCelsius() {
    }

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Εισάγετε θερμοκρασία σε Fahrenheit για μετατροπή σε Celsius: ");
        int fahrenheit = temp.nextInt();
        int celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("Η θερμοκρασία %d Fahrenheit αντιστοιχεί σε %d Celsius. %n", fahrenheit, celsius);
    }
}
