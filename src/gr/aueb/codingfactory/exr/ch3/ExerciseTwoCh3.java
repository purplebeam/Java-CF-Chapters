package gr.aueb.codingfactory.exr.ch3;

import java.util.Scanner;

public class ExerciseTwoCh3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choiceIn = 0;
        int backMenu = 0;

        do {
            System.out.println("\n\nΔιαλέξτε επιλογή (1-5): \n1. Εισαγωγή\n2. Διαγραφή\n3. Ενημέρωση\n4. Αναζήτηση\n5. Έξοδος");
            choiceIn = in.nextInt();

            if (backMenu == 5) {
                backMenu = 0;
            }

            if (choiceIn == 1){
                do {
                    System.out.println("\t\tΕπιλέξατε 1. Εισαγωγή");
                    System.out.println("\t\tΠατήστε 5 για να πάτε πίσω στο μενού.");
                    backMenu = in.nextInt();
                }while (backMenu !=5);
            } else if (choiceIn == 2) {
                do {
                    System.out.println("\t\tΕπιλέξατε 2. Διαγραφή");
                    System.out.println("\t\tΠατήστε 5 για να πάτε πίσω στο μενού.");
                    backMenu = in.nextInt();
                }while (backMenu !=5);
            } else if (choiceIn == 3) {
                do {
                    System.out.println("\t\tΕπιλέξατε 3. Ενημέρωση");
                    System.out.println("\t\tΠατήστε 5 για να πάτε πίσω στο μενού.");
                    backMenu = in.nextInt();
                }while (backMenu !=5);
            } else if (choiceIn == 4) {
                do {
                    System.out.println("\t\tΕπιλέξατε 4. Αναζήτηση");
                    System.out.println("\t\tΠατήστε 5 για να πάτε πίσω στο μενού.");
                    backMenu = in.nextInt();
                }while (backMenu !=5);
            } else if (choiceIn>5 || choiceIn<=0){
                do {
                    System.out.println("\t\tΕκτός Εύρους επιλογών (1-5)");
                    System.out.println("\t\tΠατήστε 5 για να πάτε πίσω στο μενού.");
                    backMenu = in.nextInt();
                }while (backMenu !=5);
            }
        }while (choiceIn != 5);

        System.out.println("\t\tΕπιτυχία Εξόδου.");


    }

}
