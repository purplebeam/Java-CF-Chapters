package gr.aueb.codingfactory.ch2;

public class AdderDemo {
    public AdderDemo() {
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("(println) Το άθροισμα των " + num1 + " και " + num2 + " είναι " + sum);
        System.out.printf("(printf) Το άθροισμα των %d και %d είναι %d", Integer.valueOf(num1), Integer.valueOf(num2), sum);
    }
}
