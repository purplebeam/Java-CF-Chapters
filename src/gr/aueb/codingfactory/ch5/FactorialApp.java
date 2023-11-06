package gr.aueb.codingfactory.ch5;

public class FactorialApp {

    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    /**
     *
     * @param n the input number
     * @return the factorial of n
     */
    public static int facto(int n){
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *=i;
        }
        return factorial;
    }
}
