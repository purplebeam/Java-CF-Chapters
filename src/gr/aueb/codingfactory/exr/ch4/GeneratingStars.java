package gr.aueb.codingfactory.exr.ch4;

import java.util.Scanner;

/**
 * Όνομα: Κωνσταντίνος
 * Επίθετο: Παπαγεωργίου
 *
 * Αναπτύξτε πέντε προγράμματα αντίστοιχα με τα προηγούμενα όπου ο χρήστης θα δίνει το πλήθος των stars, έστω n
 * –
 * n οριζόντια αστεράκια
 * n κάθετα
 * nxn
 * από 1 έως n
 * από n έως 1
 */
public class GeneratingStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int starsUserInputX = 0;
        int starsUserInputY = 0;
        int starsUserGeneral = 0;
        int userChoice = 0;

        System.out.println("Εισάγετε τρόπο που θέλετε να εμφανιστούν τα αστεράκια: ");
        System.out.printf("1. Οριζόντια Αστεράκια\n" +
                          "2. Κάθετα Αστεράκια\n" +
                          "3. Πλήθος n-x-n\n" +
                          "4. από 1 έως n\n" +
                          "5. από n έως n\n");
        userChoice = scanner.nextInt();

        switch (userChoice) {

            case 1:
                System.out.println("Εισάγετε τον αριθμό με τα οριζόντια αστεράκια που θέλετε: ");
                starsUserInputX = scanner.nextInt();

                for (int i = 1; starsUserInputX >= i; i++) {
                    System.out.print("*");
                }
            break;

            case 2:
                System.out.println("Εισάγετε τον αριθμό με τα κάθετα αστεράκια που θέλετε: ");
                starsUserInputX = scanner.nextInt();

                for (int i = 1; starsUserInputX >= i; i++) {
                    System.out.println("*");
                }
            break;

            case 3:
                System.out.println("Εισάγετε το οριζόντιο n: ");
                starsUserInputX = scanner.nextInt();
                System.out.println("Εισάγετε το κάθετο n: ");
                starsUserInputY = scanner.nextInt();

                for (int i = 1; starsUserInputX > i; i++) {
                    System.out.print("*");
                    for(int j = 1; starsUserInputY >j; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;

            case 4:
                System.out.println("Εισάγετε το n για 1 έως n: ");
                starsUserGeneral = scanner.nextInt();

                for (int i = 1; i<=starsUserGeneral; i++) {
                    System.out.print("*");
                    for (int j = 1; j<=i; j++ ){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;

            case 5:
                System.out.println("Εισάγετε το n για 1 έως n: ");
                starsUserGeneral = scanner.nextInt();

                for (int i = 1; i <= starsUserGeneral; i++){
                    for(int j = starsUserGeneral; j>=i; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            break;
        }
    }
}
