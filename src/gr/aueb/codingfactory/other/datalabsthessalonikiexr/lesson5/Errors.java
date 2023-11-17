package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson5;

public class Errors {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        int z = 0;

        int[] array = new int[5];

        try {
            z = x / y;
            array[5] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Error Handling Activated." + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
