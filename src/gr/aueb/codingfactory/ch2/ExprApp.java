package gr.aueb.codingfactory.ch2;
public class ExprApp {
    public ExprApp() {
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 20;
        int sum = 0;
        int result1 = 0;
        sum = num1 + num2;
        System.out.println(sum);
        result1 = num1++;
        System.out.println(result1);
    }
}
