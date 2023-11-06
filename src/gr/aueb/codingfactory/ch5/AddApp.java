package gr.aueb.codingfactory.ch5;

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a,b);

        System.out.printf("%d + %d = %d", a,b,result);

    }

    /**
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a, b
     */
    public static int add(int a, int b){
        int sum = 0;

        sum = a + b;

        return sum;
    }

}
