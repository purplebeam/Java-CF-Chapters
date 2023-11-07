//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gr.aueb.codingfactory.ch2;

import java.util.Scanner;

public class BankOfScotlandApp {
    public BankOfScotlandApp() {
    }

    public static void main(String[] args) {
        int scottishPounds = 0;
        int usdDollars = 0;
        int usdCents = 0;
        int totalUsdCents = 0;
        int PARITY = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the amount of Scottish pounds: ");
        scottishPounds = scanner.nextInt();
        totalUsdCents = scottishPounds * 137;
        usdDollars = totalUsdCents / 100;
        usdCents = totalUsdCents % 100;
        System.out.printf(" £ %d (Scottish Pounds) = %d USD Dollars and %d USD Cents", scottishPounds, usdDollars, usdCents);
    }
}
