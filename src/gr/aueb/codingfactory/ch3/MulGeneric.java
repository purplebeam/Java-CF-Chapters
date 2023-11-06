package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class MulGeneric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //το 1 είναι το ουδέτερο στοιχείο του πολ/μού
        int result = 1;
        int n = 0;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <=n){

            result = result * i; // ή result *= 1;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
