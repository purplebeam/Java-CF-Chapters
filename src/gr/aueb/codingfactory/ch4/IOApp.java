package gr.aueb.codingfactory.ch4;

import java.io.IOException;

public class IOApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';

        System.out.print("Please insert a char: ");
        ch = (char) System.in.read();

        System.out.println(ch);
    }
}
