package gr.aueb.codingfactory.ch1;

public class AddApp {
    public AddApp() {
    }

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 12L;
        int result = (int) (num2 + num1);
        System.out.println(num2);
        System.out.println("Result of : num1 -> " + num1 + " num2 -> " + num2 + " is: " + result);
    }
}
