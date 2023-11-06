package gr.aueb.codingfactory.ch3;

public class Sum10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <=10){
            sum = sum + i; // ή sum +=i;
            i++;
            System.out.println(sum);
        }

        System.out.println("Sum = " + sum);
    }
}
