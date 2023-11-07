package gr.aueb.codingfactory.ch1;

import java.util.Scanner;

public class MenuApp {
    public MenuApp() {
    }

    public static void main(String[] args) {
        Scanner choiceNumber = new Scanner(System.in);
        System.out.println("\n\tΕπιλέξτε μία από τις παρακάτω επιλογές: \n\t1. Εισαγωγή\n\t2. Διαχείριση\n\t3. Αναζήτηση\n\t4. Ενημέρωση\n\t5. Έξοδος\n\tΔώστε αριθμό επιλογής: \t");

        try {
            int userSelected = choiceNumber.nextInt();
            if (userSelected == 1) {
                System.out.println("Έχετε επιλέξει την επιλογή : 1. Εισαγωγή");
            } else if (userSelected == 2) {
                System.out.println("Έχετε επιλέξει την επιλογή : 2. Διαγραφή");
            } else if (userSelected == 3) {
                System.out.println("Έχετε επιλέξει την επιλογή : 3. Αναζήτηση");
            } else if (userSelected == 4) {
                System.out.println("Έχετε επιλέξει την επιλογή : 4. Ενημέρωση");
            } else if (userSelected == 5) {
                System.out.println("Έχετε επιλέξει την επιλογή : 5. Έξοδος");
            }
        } catch (Exception var3) {
            System.out.println("Μη συμβατή επιλογή!");
        }

    }
}
