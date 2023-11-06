package gr.aueb.codingfactory.ch3;

import java.util.Scanner;

public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int moduleCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules' count");
        moduleCount = in.nextInt();

        average = totalMarks / moduleCount;
        if (average < 0 || average >10){
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >=9) {
            System.out.println("Excellent: " + average);
        } else if (average >=7) {
            System.out.println("Very Good: " + average);
        } else if (average >=5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
