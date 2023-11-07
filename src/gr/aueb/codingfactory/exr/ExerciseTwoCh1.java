package gr.aueb.codingfactory.exr;

import java.util.Scanner;

/**
 * Όνομα : Κωνσταντίνος
 * Επίθετο : Παπαγεωργίου
 * Email : konvpapageorgiou@gmail.com
 *
 * Άσκηση 1 - Java - MenuApp
 *
 * Γράψτε ένα πρόγραμμα, νέα κλάση με όνομα MenuApp
 * μέσα στο package gr aueb gr ch 11, που να εκτυπώνει
 * το παρακάτω Μενού (χωρίς το κόκκινο πλαίσιο):
 * Επιλέξτε μία από τις παρακάτω επιλογές:
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Αναζήτηση
 * 4. Ενημέρωση
 * 5. Έξοδος
 * Δώστε αριθμό επιλογής:
 */
public class ExerciseTwoCh1 {

    public static void main(String[] args) {

        Scanner choiceNumber = new Scanner(System.in);

        System.out.println("\n\tΕπιλέξτε μία από τις παρακάτω επιλογές: \n\t1. Εισαγωγή\n\t2. Διαχείριση\n\t3. Αναζήτηση\n\t4. Ενημέρωση\n\t5. Έξοδος\n\tΔώστε αριθμό επιλογής: \t");


        // Προαιρετική λειτουργία εκτός εκφώνησης άσκησης
//        try {
//            int userSelected = choiceNumber.nextInt();
//
//            if (userSelected == 1) {
//                System.out.println("Έχετε επιλέξει την επιλογή : 1. Εισαγωγή");
//            } else if (userSelected == 2) {
//                System.out.println("Έχετε επιλέξει την επιλογή : 2. Διαγραφή");
//            } else if (userSelected == 3) {
//                System.out.println("Έχετε επιλέξει την επιλογή : 3. Αναζήτηση");
//            } else if (userSelected == 4) {
//                System.out.println("Έχετε επιλέξει την επιλογή : 4. Ενημέρωση");
//            } else if (userSelected == 5) {
//                System.out.println("Έχετε επιλέξει την επιλογή : 5. Έξοδος");
//            }
//        } catch (Exception e){
//            System.out.println("Μη συμβατή επιλογή!");
//        }
    }
}
