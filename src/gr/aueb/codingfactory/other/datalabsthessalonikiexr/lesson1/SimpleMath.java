package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson1;

public class SimpleMath {

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 4;
        int sum = 13;
        int result = num1 + num2;
        String underline = "__";
        System.out.print(result + underline);

        sum +=num1;
        System.out.print(sum + underline);
        System.out.print(sum++ + underline);
        System.out.print(sum + underline);
        System.out.print(++sum + underline);
        System.out.print(sum + underline);
        System.out.print(sum-- + underline);
        System.out.print(sum + underline);
        System.out.print(--sum + underline);
        System.out.print(sum + underline);

        System.out.print(num1 + num2 + underline);
        System.out.print(num1 - num2 + underline);
        System.out.print(num1 * num2 + underline);
        System.out.print(num1 / num2 + underline);
        System.out.print(num1 % num2 + underline);
    }
}
