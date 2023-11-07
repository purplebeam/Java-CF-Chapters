package gr.aueb.codingfactory.exr;

/**
 * Όνομα : Κωνσταντίνος
 * Επίθετο : Παπαγεωργίου
 * Email : konvpapageorgiou@gmail.com
 *
 * Άσκηση 3 - Java - SumApp
 * Γράψτε ένα πρόγραμμα που δηλώνει δύο μεταβλητές ακεραίων num1 και num2
 * και αποθηκεύει το αποτέλεσμα της πρόσθεσης num1 + num2 στη
 * μεταβλητή sum.
 * Στη συνέχεια εκτυπώνει με println το εξής κείμενο: Το αποτέλεσμα της πρόσθεσης είναι ίσο με [το αποτέλεσμα της πρόσθεσης]
 * •
 * Δοκιμαστικά Δεδομένα
 * –
 * num
 * num1 = 19 και num2 = 30
 * –
 * Αναμενόμενα Αποτέλεσμα: 49
 */
public class ExerciseThreeCh1 {

    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 30;

        int sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης των αριθμών " + num1 + "+" + num2 + " είναι ίσο με " + sum);
    }
}
