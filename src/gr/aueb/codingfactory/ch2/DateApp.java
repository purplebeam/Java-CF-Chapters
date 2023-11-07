package gr.aueb.codingfactory.ch2;

import java.util.Scanner;

public class DateApp {
    public DateApp() {
    }

    public static void main(String[] args) {
        Scanner userDay = new Scanner(System.in);
        System.out.println("Εισάγεται τον αριθμό της Ημέρας: ");
        int usDay = userDay.nextInt();
        Scanner userMonth = new Scanner(System.in);
        System.out.println("Εισάγεται τον αριθμό του Μήνα: ");
        int usMonth = userMonth.nextInt();
        Scanner userYear = new Scanner(System.in);
        System.out.println("Εισάγεται τον αριθμό του Έτους: ");
        int usYear = userYear.nextInt();
        System.out.printf("Η Ημερομηνία που εισάγατε είναι : %d/%d/%d", usDay, usMonth, usYear);
    }
}
