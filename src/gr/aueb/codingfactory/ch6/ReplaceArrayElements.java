package gr.aueb.codingfactory.ch6;

/**
 *  Demonstrates 'Update' of array
 *  elements.
 */
public class ReplaceArrayElements {

    public static void main(String[] args) {
        int[] grades = {7, 8, 6, 9, 4, 5 };
        increaseByOne(grades);

        for (int grade : grades) {
            System.out.println(grade + " ");
        }
    }

    /**
     * Traverses and updates each array
     * element increasing by one.
     *
     * @param arr   the source array.
     */
    public static void increaseByOne(int[] arr ){
        if (arr == null) return;

        for (int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }
    }
}
