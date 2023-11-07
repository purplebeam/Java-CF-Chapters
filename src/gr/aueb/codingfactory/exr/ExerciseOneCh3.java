package gr.aueb.codingfactory.exr;

/*
  Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να αποφαίνεται αν ένα έτος είναι δίσεκτο ή όχι
  Δηλαδή να προτρέπει τον χρήστη να δώσει ένα έτος από το πληκτρολόγιο, να διαβάζει
  με Scanner το έτος (ακέραιος), να κάνει την επεξεργασία και να εμφανίζει
  στην οθόνη αν το έτος αυτό είναι δίσεκτο ή όχι. Δίσεκτο είναι ένα έτος αν έχει 366 ημέρες, αντί 365. Πότε όμως ένα έτος έχει 366 ημέρες
  Αν διαιρείται με το 4 ΕΚΤΟΣ ΕΆΝ
  Διαιρείται ακριβώς και με το 100
  Αλλά όχι με το 400.
  Άλλος τρόπος να το εκφράσουμε πιο απλά είναι: ένα έτος είναι δίσεκτο
  αν (διαιρείται ακριβώς με το 4 και όχι με το 100) ή αν (διαιρείται ακριβώς με το 400)
  Σύμφωνα με τον ορισμό του δίσεκτου έτους αν ένα έτος διαιρείται με το 4 (και όχι με το 100)
  τότε είναι δίσεκτο, Για αυτό τα έτη 1904, 1908, 1964, 2004, 2008, 2012, 2016, 2020 ΕΊΝΑΙ δίσεκτα
  Ωστόσο, τα ακόλουθα έτη1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600 ΔΕΝ είναι δίσεκτα,
  επειδή διαιρούνται μεν με το 4 αλλά διαιρούνται και με το 100 αλλά ΟΧΙ και με το 400
  Τα ακόλουθα έτη: 1600, 2000, 2400ΕΙΝΑΙ δίσεκτα, επειδή διαιρούνται με το 4,
  διαιρούνται και με το 100 αλλά και με το 400 (ή απλά επειδή διαιρούνται με το 400)
 */

import java.util.Scanner;

public class ExerciseOneCh3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearInput = 0;
        boolean leap = false;

        System.out.println("Insert year to check if is a leap year or not: ");
        yearInput = in.nextInt();

        boolean parameterOne = ((yearInput%4)==0);
        boolean parameterTwo = ((yearInput%100)==0);
        boolean parameterThree = ((yearInput%400)==0);

        if ((parameterOne && !parameterTwo)){
            leap = true;
            System.out.printf("The year: %d is a leap! Divided by 4!",yearInput);
        } else if (parameterOne && !parameterTwo && parameterThree) {
            leap = true;
            System.out.printf("The year: %d is a leap! Divided by 4 and 100!",yearInput);
        } else if ((parameterOne && parameterTwo && parameterThree)) {
            leap = true;
            System.out.printf("The year: %d is a leap! Divided by 4 and 100 and 400!",yearInput);
        } else {
            System.out.printf("The year: %d is not a leap!",yearInput);
        }

    }
}
