package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class SummarizeNumbers {

    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println(sum);

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
