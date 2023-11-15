package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson1;

public class EducationCalculator {

    public static void main(String[] args) {

        int bYear = 1995;
        int age = 2023 - bYear;

        if (age >= 6 && age<=12){
            System.out.println("Δημοτικό Σχολείο");
        } else if (age>=13 && age<=15) {
            System.out.println("Γυμνάσιο Σχολείο");
        } else if (age>=16 && age<=18) {
            System.out.println("Λύκειο Σχολείο");
        } else {
            System.out.println("Ενήλικας ή Φοιτητής");
        }

    }
}
