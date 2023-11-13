package gr.aueb.codingfactory.ch6;

public class SwapApp {

    public static void main(String[] args) {

    }

    public static void swap(int[] arr){
        if (arr == null) return;
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void print(int[] arr){

        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}
