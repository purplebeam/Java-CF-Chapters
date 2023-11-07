package gr.aueb.codingfactory.ch6;

/**
 *  Array Initializer
 */
public class ArrayInitializer {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {1, 2, 3, 4, 5, 6};

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
