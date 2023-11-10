package gr.aueb.codingfactory.ch4;

/**
 * Εκτυπώνει stars 1-1 ,1-2 κλπ.
 */
public class StarsAsc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
