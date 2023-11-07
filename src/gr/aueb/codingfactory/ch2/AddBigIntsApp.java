package gr.aueb.codingfactory.ch2;

import java.math.BigInteger;

public class AddBigIntsApp {
    public AddBigIntsApp() {
    }

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("213457586789");
        BigInteger bigNum2 = new BigInteger("21345758678942141242146546345634573457");
        BigInteger result = bigNum1.add(bigNum2);
        System.out.printf("%,d", result);
    }
}
